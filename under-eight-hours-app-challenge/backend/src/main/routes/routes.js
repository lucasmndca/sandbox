const express = require('express')
const routes = express()
const productService = require('../services/productService')

// Main
routes.get('/', (req, res) => {
    res.status(200).json({message: 'Welcome!'})
})

// List
routes.get('/list', async (req, res) => {
    try {
        res.status(200).json(await productService.list())
    } catch (error) {
        console.error(error)
        res.status(500).json({message: 'Could not list products.', error})
    }
})

// Products
routes.post('/products/add', async (req, res) => {
    try {
        res.status(200).json(await productService.add(req.body))
    } catch (error) {
        console.error(error)
        res.status(500).json({message: 'Could not add product.'}, error)
    }
})

routes.delete('/products/delete', async (req, res) => {
    try {
        res.status(200).json(await productService.remove(req.query.id))
    } catch (error) {
        console.error(error)
        res.status(500).json({message: 'Could not add product.'}, error)
    }
})

module.exports = routes
const timestamp = require('time-stamp')
const timestampUtils = require('../utils/timestamp/timestampUtils')
const Product = require('../models/Product')

const list = async () => {
    console.log(`[INFO] Listed all products at ${timestamp(timestampUtils.mask)}`)
    return await Product.find()
}

const add = async ({ name, description, cost, price }) => {
    console.log(`[INFO] Adding product \"${name}\" at ${timestamp(timestampUtils.mask)}`)
    return await Product.create({
        name, 
        description, 
        cost, 
        price,
        createdAt: new Date()
    })
}

const remove = async (_id) => {
    console.log(`[INFO] Deleting product \"${_id}\" at ${timestamp(timestampUtils.mask)}`)
    return await Product.deleteOne({_id})
}

module.exports = {
    list,
    add,
    remove
}
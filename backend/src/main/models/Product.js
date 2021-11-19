const mongoose = require('mongoose')

module.exports = mongoose.model('Product', {
    name: String,
    description: String,
    cost: Number,
    price: Number
})
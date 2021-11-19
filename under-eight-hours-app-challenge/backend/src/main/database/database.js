require('dotenv').config()
const mongoose = require('mongoose')

const connect = async () => {
    try {
        await mongoose.connect(`${process.env.DB_HOST_BASE}${process.env.DB_USER}:${process.env.DB_PSWD}${process.env.DB_HOST_ROUTE}`)
        console.log('[INFO] Connected to the database.')
    } catch (error) {
        console.error('[ERROR] Could not connect to the database.')
    }
}

module.exports = {
    connect
}
const express = require('express')
const cors = require('cors')
const routes = require('./routes/routes')
const database = require('./database/database')

async function server() {

    const app = express()
    const port = 5000
    const options = { origin: 'http://127.0.0.1:5500/' }

    // Connection
    await database.connect()

    // Config
    app.use(cors(options))
    app.use(express.json())
    app.use(express.urlencoded({ extended: false }))

    // Routes
    app.use(routes)

    // Run
    app.listen(port, () => {
        console.log(`[INFO] App running on port ${port}`)
    })
}

// Start
server()
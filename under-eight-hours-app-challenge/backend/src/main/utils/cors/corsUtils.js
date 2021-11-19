module.exports = {
    origin: 'http://127.0.0.1:5500',
    methods: ['GET', 'PUT', 'POST', 'DELETE'],
    preflightContinue: false,
    allowedHeaders: ['Content-Type', 'Accept'],
    optionsSuccessStatus: 200
}
app.config(function ($routeProvider, $locationProvider) {
    $locationProvider.html5Mode(true)
    $routeProvider
        .when('/', {
            template: '<products-list></products-list>'
        })
        .when('/add', {
            template: '<add-products></add-products>'
        })
        .otherwise({ redirectTo: '/' });
})
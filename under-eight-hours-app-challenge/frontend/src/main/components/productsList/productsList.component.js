function ProductsListController($scope, productFactory) {
    this.title = 'Products list'

    this.headings = {
        id: 'id',
        name: 'Name',
        description: 'Description',
        cost: 'Purchase cost',
        price: 'Sell price',
        actions: 'Actions'
    }
    
    this.remove = async (id) => {
        const result = await productFactory.remove(id)
        if (result.error) {
            alert('Could not delete product.')
        } else {
            alert('Product successfully deleted')
            this.list()
        }
    }

    this.list = async () => {
        this.products = await productFactory.list()
        $scope.$apply()
    }
}

app.component('productsList', {
    templateUrl: 'src/main/components/productsList/productsList.component.html',
    controller: ['$scope', 'productFactory', ProductsListController]
})
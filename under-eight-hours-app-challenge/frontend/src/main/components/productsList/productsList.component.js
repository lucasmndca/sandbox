function ProductsListController() {
    this.title = 'Products list'

    this.headings = {
        id: 'id',
        name: 'Name',
        desc: 'Description',
        cost: 'Purchase cost',
        price: 'Sell price',
        actions: 'Actions'
    }

    this.products = [
        {
            id: 1,
            name: 'Name',
            desc: 'Description',
            cost: 123,
            price: 300
        }
    ]

    this.delete = (id) => {
        const idx = this.products.findIndex(p => p.id === id)
        const deleted = this.products.splice(idx, 1)
    }
}

app.component('productsList', {
    templateUrl: 'src/main/components/productsList/productsList.component.html',
    controller: ProductsListController
})
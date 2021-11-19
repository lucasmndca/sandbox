function AddProductsController() {
    this.title = 'Add Products'

    this.buttons = {
        add: 'add',
        reset: 'reset'
    }

    this.product = {}

    this.add = () => {
        console.log(this.product)
    }

    this.reset = () => {
        this.product = {}
    }
}

app.component('addProducts', {
    templateUrl: 'src/main/components/addProducts/addProducts.component.html',
    controller: AddProductsController
})
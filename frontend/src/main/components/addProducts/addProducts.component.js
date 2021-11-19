function AddProductsController(productFactory) {
    this.title = 'Add Products'

    this.buttons = {
        add: 'add',
        reset: 'reset'
    }

    this.product = {}

    this.add = async () => {
        const result = await productFactory.add(this.product)
        if (result.error) {
            alert(result.error)
        } else {
            alert('Product successfully added!')
            window.location.href = '/'
        }
    }

    this.reset = () => {
        this.product = {}
    }
}

app.component('addProducts', {
    templateUrl: 'src/main/components/addProducts/addProducts.component.html',
    controller: ['productFactory', AddProductsController]
})
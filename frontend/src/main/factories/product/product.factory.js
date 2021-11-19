app.factory('productFactory', () => {
    
    const baseUrl = 'http://localhost:5000'

    const headers = {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    }

    const list = async () => {
        try {
            const res = await fetch(`${baseUrl}/list`, {
                method: 'GET',
                headers
            })
            return res.json()
        } catch (error) {
            console.error(error)
        }
    }

    const add = async (product) => {
        try {
            const res = await fetch(`${baseUrl}/products/add`, {
                method: 'POST',
                body: JSON.stringify(product),
                headers
            })
            return res.json()
        } catch (error) {
            console.error(error)
            return {error}
        }
    }

    const remove = async (id) => {
        try {
            const res = await fetch(`${baseUrl}/products/delete?id=${id}`, {
                method: 'DELETE',
                headers
            })
            return res.json()
        } catch (error) {
            console.error(error)
            return {error}
        }
    }

    return {
        list,
        add,
        remove
    }
})
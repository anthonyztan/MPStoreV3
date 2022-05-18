<template>
    <div class = "container">     
            <h1 class = "text-center"> Products List</h1>

            <table class = "table table-striped">
                <thead>
                    <tr>
                        <th> Product Name</th>
                        <th> Product Description</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="product in products" v-bind:key="product.product_name">
                        <td> {{product.product_name }}</td>
                        <td> {{product.product_desc}}</td>    
                    </tr>
                </tbody>
            </table>
        </div>
</template>

<script>

import ProductService from '../services/ProductService';

export default {
    name: 'ProductsList',
    data(){
        return {
            products: []
        }
    },
    methods: {
        getProducts(){
            ProductService.getProducts().then((response) => {
                this.products = response.data;   
            });
        }
    },
    created() {
        this.getProducts();
    }
}

</script>
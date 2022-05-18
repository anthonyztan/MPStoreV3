<template>
<div>
  <h1>STORE</h1>   
</div>
<div>
  <div class = "row">
    <div class = "column" v-for = "product in productList" :key = "product.name">
      <product-card :item="product"></product-card>
    </div>
  </div>    
</div>
</template>

<script>
import ProductCard from '../components/ProductCard.vue'

export default {
  name: 'StoreView',
  components: {
    ProductCard
  },
  data () {
    return {
      productList: [
        {name: 'Glasses', price: '24.99', desc: 'To see better'},
        {name: 'Mouse', price: '20.00', desc: 'Computer mouse'}
      ]
    }
  },
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

.row {
  display: flex;
}

.column {
  flex: 50%;
}
</style>
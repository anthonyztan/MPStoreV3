<template>
<nav>
  <router-link to="/store">Store</router-link> |
  <router-link to="/mysales">My Sales</router-link> |
  <router-link to="/addproduct">Add Product</router-link> |
  <router-link to="/login">Log-in</router-link> |
  <router-link to="/register">Register</router-link>
</nav>
<input type="text" name="nameanddesc" v-model="input.name"/>
<ProductsList></ProductsList>
<router-view />
</template>

<script>
import ProductsList from './components/Products.vue'

export default {
  name: 'App',
  components: {
    ProductsList
  },
  data () {
    return {
      input : {
        name: ""
      }
    }
  }
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

.column {
  float: left;
  width: 50%;
}

.row:after {
  content: "";
  display: table;
  clear: both;
}
</style>
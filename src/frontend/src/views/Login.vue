<template>
    <div id="login">
        <h1>LOGIN</h1>
        <input type="text" name="username" v-model="input.username" placeholder="Username" />
        <input type="password" name="password" v-model="input.password" placeholder="Password" />
        <button type="button" v-on:click="login()">Login</button>
    </div>
</template>

<script>

export default {
  name: 'LogIn',
  components: {
  },
  data () {
    return {
      input : {
        username: "",
        password: ""
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

.row {
  display: flex;
}

.column {
  flex: 50%;
}
</style>
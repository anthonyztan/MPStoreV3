import { createRouter, createWebHistory } from "vue-router";
import StoreView from "../views/Store";
import MySales from "../views/MySales";
import AddProduct from "../views/AddProduct";
import LogIn from "../views/Login";
import RegisterView from "../views/Register";

const routes = [
    {
        path: '/store',
        name: 'store',
        component: StoreView
    },
    {
        path: '/mysales',
        name: 'mysales',
        component: MySales
    },
    {
        path: '/addproduct',
        name: 'addproduct',
        component: AddProduct
    },
    {
        path: '/login',
        name: 'login',
        component: LogIn
    },
    {
        path: '/register',
        name: 'register',
        component: RegisterView
    }
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})

export default router
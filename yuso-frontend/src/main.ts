import { createApp } from 'vue'
import './style.css'
import App from './App.vue'

import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import { createPinia } from 'pinia'
// 1. 引入刚才写好的路由
import router from './router' 

const app = createApp(App)

app.use(ElementPlus)
app.use(createPinia())
// 2. 启用路由
app.use(router) 

app.mount('#app')
import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [vue()],
  // 关键新增部分：传入一个空对象，直接切断 Vite 向上查找 PostCSS 配置的念头
  css: {
    postcss: {} 
  },
  server: {
    // 你之前的代理配置保留不动...
    proxy: {
      '/api': {
        target: 'http://localhost:8081',
        changeOrigin: true,
      
        rewrite: (path) => path.replace(/^\/api/, '')
      }
    }
  }
})
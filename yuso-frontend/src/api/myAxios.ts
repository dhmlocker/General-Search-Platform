import axios from 'axios'
import { ElMessage } from 'element-plus'

// 1. 创建一个 Axios 实例
const myAxios = axios.create({
  // 所有的请求都会自动带上 /api 前缀，从而触发上面配置的 Vite 代理
  baseURL: '/api', 
  timeout: 10000, // 超时时间 10 秒
})

// 2. 添加响应拦截器 (剥离最外层的 data，并统一处理后端的自定义 code)
myAxios.interceptors.response.use(
  function (response) {
    // 这里的 response.data 就是你后端传过来的 BaseResponse 对象
    const res = response.data

    // 如果后端的 code 是 0，代表一切顺利，直接把真正的数据 (res.data) 剥离出来给页面用
    if (res.code === 0) {
      return res.data
    } else {
      // 如果 code 不是 0，说明后端报了业务异常 (比如参数错误)，统一弹窗提示
      ElMessage.error(res.message || '系统错误')
      return Promise.reject(new Error(res.message || 'Error'))
    }
  },
  function (error) {
    // 处理 HTTP 级别的网络错误 (比如后端挂了，报 404/500)
    ElMessage.error('网络异常，请稍后重试')
    return Promise.reject(error)
  }
)

export default myAxios
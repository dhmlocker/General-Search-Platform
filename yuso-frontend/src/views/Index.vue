<template>
  <div class="index-page">
    <h1 class="logo">通用搜索平台</h1>
    
    <div class="search-box">
      <el-input v-model="searchText" placeholder="输入关键词搜索" size="large" @keyup.enter="handleSearch">
        <template #append>
          <el-button type="primary" @click="handleSearch" :loading="loading">搜索</el-button>
        </template>
      </el-input>
    </div>

    <el-tabs v-model="activeTab" @tab-change="onTabChange">
      <el-tab-pane label="文章" name="post"></el-tab-pane>
      <el-tab-pane label="图片" name="picture"></el-tab-pane>
      <el-tab-pane label="用户" name="user"></el-tab-pane>
    </el-tabs>

    <div class="result-box" v-loading="loading">
      <template v-if="activeTab === 'post'">
        <el-card 
          v-for="(item, index) in postList" 
          :key="index" 
          class="result-item click-card"
          @click="toDetail(item.url || item.contentUrl)"
        >
          <h3 v-html="highlight(item.title)"></h3>
          <p class="post-content" v-html="highlight(item.content)"></p>
        </el-card>
      </template>

      <template v-else-if="activeTab === 'picture'">
        <el-row :gutter="20">
          <el-col :span="6" v-for="(item, index) in postList" :key="index">
            <el-card 
              :body-style="{ padding: '0px' }" 
              class="picture-card click-card"
              @click="toDetail(item.url)"
            >
              <el-image 
                :src="item.url" 
                fit="cover" 
                style="width: 100%; height: 150px"
                lazy
              >
                <template #error>
                  <div class="image-slot">FAILED</div>
                </template>
              </el-image>
              <div class="picture-title" v-html="highlight(item.title)"></div>
            </el-card>
          </el-col>
        </el-row>
      </template>

      <template v-else-if="activeTab === 'user'">
        <el-row :gutter="20">
          <el-col :span="8" v-for="(item, index) in postList" :key="index">
            <el-card class="user-card click-card" shadow="hover">
              <div class="user-info-box">
                <el-avatar :size="60" :src="item.userAvatar" />
                <div class="user-text">
                  <div class="user-name" v-html="highlight(item.username)"></div>
                  <div class="user-profile" v-html="highlight(item.userProfile)"></div>
                </div>
              </div>
            </el-card>
          </el-col>
        </el-row>
      </template>

      <el-empty v-if="!postList || postList.length === 0" description="换个词试试看" />
    </div>

    <div class="pagination-box" v-if="total > 0">
      <el-pagination
        background
        layout="total, prev, pager, next"
        v-model:current-page="currentPage"
        :page-size="pageSize"
        :total="total"
        @current-change="onPageChange"
      />
    </div>
  </div>
</template>

<script setup lang="ts">
import { ref } from 'vue';
import myAxios from '../api/myAxios';
import { ElMessage } from 'element-plus';

const searchText = ref('');
const activeTab = ref('post');
const loading = ref(false);
const postList = ref<any[]>([]);

const currentPage = ref(1);
const pageSize = ref(12);
const total = ref(0);

const toDetail = (url: string) => {
  // 💡 增加 URL 校验，只有有效的 http 链接才允许跳转
  if (url && (url.startsWith('http') || url.startsWith('https'))) {
    window.open(url, '_blank');
  } else {
    ElMessage.warning('暂无详情链接，请尝试搜索其他内容'); //
  }
};

const onSearch = async () => {
  loading.value = true;
  try {
    const res: any = await myAxios.post('/search/all', {
      searchText: searchText.value,
      type: activeTab.value,
      current: currentPage.value,
      pageSize: pageSize.value,
    });
    
    postList.value = res.dataList || [];
    total.value = res.total || 0; 
    
  } catch (error) {
    ElMessage.error('搜索失败');
  } finally {
    loading.value = false;
  }
};

const handleSearch = () => {
  currentPage.value = 1;
  onSearch();
};

const onPageChange = (page: number) => {
  currentPage.value = page;
  onSearch();
  window.scrollTo({ top: 0, behavior: 'smooth' });
};

const onTabChange = () => {
  currentPage.value = 1;
  onSearch(); 
};

const highlight = (text: string) => {
  if (!text) return "";
  if (!searchText.value) return text;
  const reg = new RegExp(searchText.value, 'gi');
  return text.replace(reg, `<span style="color: #f56c6c; font-weight: bold;">$&</span>`);
};
</script>

<style scoped>
.logo { text-align: center; margin-bottom: 30px; color: #409EFF; }
.index-page { padding: 20px; max-width: 1000px; margin: 0 auto; }
.search-box { margin-bottom: 20px; }
.result-item { margin-bottom: 15px; }

/* 💡 核心交互样式：点击卡片效果 */
.click-card {
  cursor: pointer;
  transition: all 0.3s cubic-bezier(0.25, 0.8, 0.25, 1);
}

.click-card:hover {
  transform: translateY(-5px);
  box-shadow: 0 10px 20px rgba(0,0,0,0.1) !important;
  border-color: #409EFF;
}

.post-content {
  color: #666;
  font-size: 14px;
  line-height: 1.6;
  display: -webkit-box;
  -webkit-line-clamp: 3;
  -webkit-box-orient: vertical;
  overflow: hidden;
}

.picture-card { margin-bottom: 20px; border-radius: 8px; overflow: hidden; }
.image-slot {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  height: 150px;
  background: #f5f7fa;
  color: #909399;
  font-size: 14px;
}

.picture-title {
  padding: 10px;
  font-size: 13px;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.user-card { margin-bottom: 20px; border-radius: 8px; }
.user-info-box { display: flex; align-items: center; gap: 15px; }
.user-text { display: flex; flex-direction: column; justify-content: center; overflow: hidden; }
.user-name { font-size: 16px; font-weight: bold; color: #333; margin-bottom: 6px; }
.user-profile { font-size: 13px; color: #999; white-space: nowrap; overflow: hidden; text-overflow: ellipsis; }
.pagination-box { display: flex; justify-content: center; margin-top: 30px; padding-bottom: 20px; }
</style>
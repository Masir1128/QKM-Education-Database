<template>
  <a-layout>
    <a-layout-sider width="200" style="background: #fff">
      <a-menu
          mode="inline"
          v-model:selectedKeys="selectedKeys2"
          v-model:openKeys="openKeys"
          :style="{ height: '100%', borderRight: 0 }"
          @click="handleClick"
      >
        <!--   -->
        <a-menu-item key="welcome">
            <MailOutlined />
            <span>欢迎</span>
        </a-menu-item>

<!--        <a-sub-menu v-for="item in level1" :key="item.id" >-->
<!--          <template v-slot:title>-->
<!--            <span><user-outlined />{{item.name}}</span>-->
<!--          </template>-->
<!--          <a-menu-item v-for="child in item.children" :key="child.id">-->
<!--            <MailOutlined /><span>{{child.name}}</span>-->
<!--          </a-menu-item>-->
<!--        </a-sub-menu>-->


        <a-sub-menu key="sub1">
          <template #title>
                <span>
                  <user-outlined />
                  培训相关
                </span>
          </template>
          <a-menu-item key="1">核心课程</a-menu-item>
          <a-menu-item key="2">管理课程</a-menu-item>
          <a-menu-item key="3">option3</a-menu-item>
          <a-menu-item key="4">option4</a-menu-item>
        </a-sub-menu>
        <a-sub-menu key="sub2">
          <template #title>
                <span>
                  <laptop-outlined />
                  课程排期
                </span>
          </template>
          <a-menu-item key="5">资料管理</a-menu-item>
          <a-menu-item key="6">课程开发</a-menu-item>
          <a-menu-item key="7">课程计划</a-menu-item>
          <a-menu-item key="8">option8</a-menu-item>
        </a-sub-menu>
        <a-sub-menu key="sub3">
          <template #title>
                <span>
                  <notification-outlined />
                  个人中心
                </span>
          </template>
          <a-menu-item key="9">个人资料</a-menu-item>
          <a-menu-item key="10">option10</a-menu-item>
          <a-menu-item key="11">option11</a-menu-item>
          <a-menu-item key="12">option12</a-menu-item>
        </a-sub-menu>
<!--        <a-sub-menu key="sub4">-->
<!--          <template #title>-->
<!--                <span>-->
<!--                  <FilePdfOutlined />-->
<!--                  资料管理-->
<!--                </span>-->
<!--          </template>-->
<!--          <a-menu-item key="13">机器人电子书</a-menu-item>-->
<!--          <a-menu-item key="14">机器人短视频</a-menu-item>-->
<!--          <a-menu-item key="15">FAQ</a-menu-item>-->
<!--          <a-menu-item key="/admin/ebook">-->
<!--            <router-link to="/admin/ebook">电子书管理</router-link>-->
<!--          </a-menu-item>-->
<!--        </a-sub-menu>-->

        <a-sub-menu key="sub5" >
          <template #title>
        <span>
         <FolderOpenOutlined />
          <span>资料管理</span>
        </span>
          </template>
          <a-menu-item-group v-for="item in level1" :key="item.id">
            <template #title>
              <FolderOutlined />
              <span>{{item.name}}</span>
            </template>
            <a-menu-item v-for="child in item.children" :key="child.id">

              <FilePdfOutlined />
              <span>{{child.name}}</span>
            </a-menu-item>
          </a-menu-item-group>

        </a-sub-menu>

      </a-menu>
    </a-layout-sider>
    <a-layout-content
        :style="{ background: '#fff', padding: '24px', margin: 0, minHeight: '280px' }"
    >
      <div class="welcome" v-show="isShowWelcome">
        <p>这是一个测试</p>
      </div>
      <a-list v-show="!isShowWelcome" item-layout="vertical" size="large" :grid="{ gutter: 20, column: 3 }" :pagination="pagination" :data-source="ebooks">

        <template #renderItem="{ item }">
          <a-list-item key="item.name">
            <template #actions>
          <span v-for="{ type, text } in actions" :key="type">
            <component v-bind:is="type" style="margin-right: 8px" />
            {{ text }}
          </span>
            </template>

            <a-list-item-meta :description="item.description">
              <template #title>
                <a :href="item.href">{{ item.name }}</a>
              </template>
              <template #avatar><a-avatar :src="item.cover" /></template>
            </a-list-item-meta>

          </a-list-item>
        </template>
      </a-list>

    </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import { defineComponent,onMounted,ref } from 'vue';
import axios from 'axios';
import { message } from 'ant-design-vue';
import {Tool} from "@/util/tool";

const listData: any = [];

for (let i = 0; i < 23; i++) {
  listData.push({
    href: 'https://www.antdv.com/',
    title: `QKM机器人 Lua语法手册${i}`,
    // avatar: 'https://s3.ax1x.com/2021/03/18/62CHfA.png',
    description:
        'Lua入门语言，机器人调试基础',
    content:
        'We supply a series of design principles, practical patterns and high quality design resources (Sketch and Axure), to help people create their product prototypes beautifully and efficiently.',
  });
}



export default defineComponent({
  name: 'Home',
  setup(){
    console.log("setup");
    const ebooks = ref();
    const categorys = ref();
    const level1 = ref();
    const isShowWelcome = ref(true);
    let categoryId2 = 0;


    const handleClick = (value: any) => {
      console.log("menu click", value)
      if (value.key === 'welcome') {
        isShowWelcome.value = true;
        console.log("----------------------")
        console.log((level1.value))
        console.log("----------------------")
      }else if(value.key === '13'){
        isShowWelcome.value = false;
        handleQueryCategory();
      }else{
        categoryId2 = value.key;
        isShowWelcome.value = false;
        handleQueryEbook();
      }
    };

    const handleQueryEbook = () =>{
      console.log("onMounted");
      axios.get("http://localhost:8880/ebook/list",{
        params:{
          page:1,
          size:1000,
          categoryId2: categoryId2
        }

      }).then((response) =>{
        const data = response.data;
        ebooks.value = data.content.list;
        console.log(response);
        console.log("------------");
        console.log(data);
      });
    }

    const handleQueryCategory = () => {
      axios.get("http://localhost:8880/category/all").then((response) => {
        const data = response.data;
        if (data.success) {
          categorys.value = data.content;
          console.log("原始数组：", categorys.value);

          level1.value = [];
          level1.value = Tool.array2Tree(categorys.value, 0);
          console.log("树形结构：", level1);
        } else {
          message.error(data.message);
        }
      });
    };

    onMounted(()=>{
      //handleQueryEbook();
      handleQueryCategory();

    });
    return {
      ebooks,
      listData,
      pagination: {
        onChange: (page: any) => {
          console.log(page);
        },
        pageSize: 10,
      },
      actions: [
        {type: 'StarOutlined', text: '156'},
        {type: 'LikeOutlined', text: '156'},
        {type: 'MessageOutlined', text: '2'},
      ],
      level1,
      handleQueryCategory,
      isShowWelcome,
      handleClick,

    }
  }
});
</script>

<style scoped>
.ant-avatar {
  width: 50px;
  height: 50px;
  line-height: 50px;
  border-radius:8%;
  margin:5px 0;
}
</style>

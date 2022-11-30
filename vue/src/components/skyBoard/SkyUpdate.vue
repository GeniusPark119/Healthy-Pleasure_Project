<template>
  <div>
    <h1>하늘보기</h1>
    <form>
      <label for="title"> 제목 </label>
      <input type="text" id="title" v-model="title" /><br />
      <label for="content"> 내용 </label>
      <textarea type="text" id="content" v-model="content" /><br />
      <button @click="createSky">등록</button>
    </form>
    <router-link to="/skyBoard">목록보기</router-link>
  </div>
</template>

<script>
import { mapState } from "vuex";
export default {
  name: "SkyUpdate",
  computed: {
    ...mapState(["skyBoards"]),
  },
  data() {
    return {
      title: "",
      content: "",
    };
  },
};
</script>

<style></style>

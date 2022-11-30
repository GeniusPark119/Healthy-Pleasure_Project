<template>
  <div>
    <router-view />
  </div>
</template>

<script>
export default {
  created() {
    this.$store.commit("GET_USERNICKNAME", sessionStorage.getItem("nickname"));
    this.$store.commit("GET_SUCCESS", sessionStorage.getItem("success"));
    this.$store.commit("GET_TODAY", sessionStorage.getItem("today"));
    this.$store.commit("GET_LUCK", sessionStorage.getItem("luck"));
    this.$store.commit("GET_SUCCESS", sessionStorage.getItem("success"));
    this.$store.commit("GET_STAR", sessionStorage.getItem("userStar"));
    this.$store.commit("GET_SEQ", sessionStorage.getItem("userSeq"));
  },
};
</script>
<style>
@font-face {
  font-family: "양진체";
  src: url("https://cdn.jsdelivr.net/gh/supernovice-lab/font@0.9/yangjin.woff")
    format("woff");
  font-weight: normal;
  font-style: normal;
}
* {
  font-family: "양진체";
}
</style>

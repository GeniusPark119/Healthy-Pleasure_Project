<template>
  <div id="Mypage">
    <header-nav></header-nav> <router-view />
    <h4 class="title">마이페이지</h4>

    <div id="misson-gage">
      <b-progress
        class="container row"
        style="float: none; margin: auto auto"
        id="misson-gage-bar"
        :value="`${userSuccess}`"
        variant="danger"
        :striped="striped"
        animated
        show-progress
      ></b-progress>
      <div id="success-button">
        <button
          style="width: 150px; float: none; margin: 0 auto"
          class="btn btn-outline-dark"
          id="button-gomedi"
          :class="{
            light: `${userSuccess}` == 100,
            dark: `${userSuccess}` != 100,
            body: true,
          }"
          v-bind:disabled="`${userSuccess}` != 100"
          @click="sendDonate"
        >
          기부하기
          <!-- {{ thema }} -->
        </button>
      </div>
    </div>
    <div id="mission-boxs">
      <a href="/skyboard" class="mission-box"
        ><img src="../assets/skyboardButton.png" /><span>하늘 보기</span></a
      >
      <a href="/walkboard" class="mission-box"
        ><img src="../assets/walkboardButton.png" /><span>5000보 걷기</span></a
      >
      <a href="/mealboard" class="mission-box"
        ><img src="../assets/mealboardButton.png" /><span>건강한 식단</span></a
      >
    </div>
    <a href="/meditation">
      <button
        style="width: 150px; float: none; margin: 0 auto"
        class="btn btn-outline-dark"
        id="button-gomedi"
      >
        명상하러 가기
      </button></a
    >
  </div>
</template>

<script>
import { mapState } from "vuex";
import HeaderNav from "../components/common/HeaderNav.vue";
export default {
  name: "MypageView",
  components: { HeaderNav },
  computed: {
    ...mapState(["userSuccess"]),
  },
  data() {
    return {
      striped: true,
      // thema: "미션중",
    };
  },
  methods: {
    sendDonate() {
      let userSeq = sessionStorage.getItem("userSeq");
      this.$store.dispatch("sendDonate", userSeq);

      // if (this.thema == "기부하기") {
      //   this.thema = "미션중";
      // } else {
      //   this.thema = "기부하기";
      // }
    },
  },
};
</script>

<style scoped>
.title {
  margin-top: 30px;
}
a {
  text-decoration: none;
  color: black;
}
#success-button button {
  width: 100px;
}
.dark {
  background: rgb(183, 183, 183);
}
.light {
  background: rgb(220, 53, 69);
}
#Mypage {
  display: flex;
  flex-direction: column;
  align-items: center;
}
#login-icon {
  width: 200px;
  height: 200px;
}
#misson-gage {
  display: flex;
  align-items: center;
  margin-top: 20px;
  width: 50%;
}
#misson-gage-bar {
  width: 600px;
  height: 30px;
  margin-right: 20px;
}
#mission-gage-button {
  height: 30px;
}

#mission-boxs {
  width: 100%;
  display: flex;
  justify-content: center;
  justify-content: space-between;
  padding-right: 150px;
  padding-left: 150px;
}
.mission-box {
  width: 300px;
  height: 300px;
  margin-top: 50px;
  margin-bottom: 50px;
  text-align: center;
}
.mission-box img {
  width: 300px;
  height: 300px;
}

#meditation {
  width: 150px;
}

#button-gomedi {
  margin-bottom: 20px;
}
</style>

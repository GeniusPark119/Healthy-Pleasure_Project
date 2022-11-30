<template>
  <header id="header">
    <nav id="mypage-nav">
      <div class="mypage-nav_part">
        <img id="header-mascot" lt="Vue logo" src="@/assets/mascot.png" />

        <span> {{ userNickname }} 님 안녕하세요</span>
      </div>
      <a href="/mypage" class="mypage-nav_part">
        <h2>SSAFIT PLEASURE</h2>
      </a>
      <div class="mypage-nav_part">
        <div>
          <span class="Todaygoal">오늘의 목표달성 {{ userToday }}/3</span>
          <button
            style="width: 100px; float: none; margin: 0 auto"
            class="btn btn-outline-dark"
            id="button-gomedi"
            @click="userLogout"
            to="/"
          >
            logout
          </button>
        </div>
      </div>
    </nav>
    <div>
      <hr />
      <span>{{ userStar }} 운세 : {{ userLuck }}</span>
    </div>
  </header>
</template>
<script>
import { mapState } from "vuex";
export default {
  methods: {
    userLogout() {
      this.$store.dispatch("userLogout");
    },
  },
  computed: {
    ...mapState(["userNickname"]),
    ...mapState(["userToday"]),
    ...mapState(["userLuck"]),
    ...mapState(["userStar"]),
  },
};
</script>

<style>
#header {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 100%;
  padding: 20px;
  box-shadow: rgba(0, 0, 0, 0.09) 0px 3px 12px;
}
.Todaygoal {
  margin-right: 20px;
}
#header-mascot {
  width: 50px;
  height: 50px;
}
.logoutButton {
  margin-left: 10px;
}
#mypage-nav {
  padding-right: 70px;
  padding-left: 70px;
  padding-top: 30px;
  display: flex;
  justify-content: space-between;
  width: 100%;
}
.mypage-nav_part {
  width: 33%;
}
#mypage-nav .mypage-nav_part:last-child {
  display: flex;
  justify-content: flex-end;
}
#mypage-nav > a {
  text-align: center;
}
#mypage-nav a {
  font-weight: bold;
  color: #2c3e50;
}
</style>

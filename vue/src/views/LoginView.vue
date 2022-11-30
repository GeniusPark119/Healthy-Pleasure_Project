<template>
  <div id="Login">
    <div id="login-slogan">
      <h1>SSAFIT + PLEASURE</h1>
      <h5>healthy pleasure in my own place</h5>
    </div>
    <div id="login-input">
      <img id="login-icon" lt="Vue logo" src="../assets/mascot.png" />
      <b-form-group id="input-id" label="아이디" label-for="userId">
        <b-form-input id="userId" v-model="user.userId" trim></b-form-input>
      </b-form-group>
      <b-form-group label="비밀번호" label-for="userPass">
        <b-form-input
          id="userPass"
          v-model="user.userPass"
          type="password"
          trim
        ></b-form-input>
      </b-form-group>
      <button
        type="button"
        id="login-icon-bt"
        class="btn btn-outline-dark"
        variant="outline-success"
        @click="loginSsafit"
      >
        로그인
      </button>
      <div id="go-regist">
        <span>아직 회원이 아니라면?</span><a href="/regist">회원가입</a>
      </div>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src
export default {
  name: "LoginView",

  data() {
    return {
      user: {
        userId: "",
        userPass: "",
      },
    };
  },
  methods: {
    loginSsafit() {
      this.$store.dispatch("userLogin", this.user);
    },
  },
};
</script>

<style scoped>
#Login {
  background-color: rgb(248, 248, 248);
  height: 100vh;
  display: flex;
  flex-direction: column;
  justify-content: center;
}
#input-id {
  margin-bottom: 10px;
}
#login-slogan {
  background-color: rgb(255, 255, 255);
  height: 300px;
  display: flex;
  flex-direction: column;
  justify-content: center;
  text-align: center;

  box-shadow: rgba(6, 24, 44, 0.4) 0px 0px 0px 2px,
    rgba(6, 24, 44, 0.65) 0px 4px 6px -1px,
    rgba(255, 255, 255, 0.08) 0px 1px 0px inset;
}
#login-icon {
  margin-top: 20px;
  width: 100px;
  height: 100px;
}
#login-input {
  display: flex;
  flex-direction: column;
  align-items: center;
}
#login-icon-bt {
  margin-top: 10px;
  margin-bottom: 10px;
}
#go-regist {
  display: flex;
}
#go-regist span {
  margin-right: 10px;
}
#go-regist a {
  text-decoration: none;
  color: rgb(220, 53, 69);
}
</style>

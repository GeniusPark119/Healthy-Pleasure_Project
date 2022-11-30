<template>
  <div id="RegistPage">
    <div id="Regist">
      <h1>회원가입</h1>
      <div id="regist-inputs">
        <div class="regist-input">
          <label for="userId"> 아이디 </label>
          <input type="text" id="userId" v-model="info.userId" /><br />
        </div>
        <div class="regist-input">
          <label for="userPass"> 비밀번호 </label>
          <input type="password" id="userPass" v-model="info.userPass" /><br />
        </div>
        <div class="regist-input">
          <label for="userName"> 이름 </label>
          <input type="text" id="userName" v-model="info.userName" /><br />
        </div>
        <div class="regist-input">
          <label for="nickname"> 닉네임 </label>
          <input type="text" id="nickname" v-model="info.nickname" /><br />
        </div>
        <div class="regist-input">
          <label for="birth"> 생일 </label>
          <b-input-group class="birth-container">
            <b-form-input
              id="birth"
              v-model="info.birth"
              type="text"
              placeholder="YYYY-MM-DD"
              autocomplete="off"
            ></b-form-input>
            <b-input-group-append>
              <b-form-datepicker
                v-model="info.birth"
                button-only
                right
                locale="ko"
                aria-controls="example-input"
              ></b-form-datepicker>
            </b-input-group-append>
          </b-input-group>
        </div>
        <div class="regist-input">
          <label for="mbti"> mbti </label>
          <b-form-select
            id="mbti"
            v-model="info.mbti"
            :options="mbtiOptions"
          ></b-form-select>
        </div>
        <div class="regist-input">
          <label for="email"> 이메일 </label>
          <input type="email" id="email" v-model="info.email" /><br />
        </div>
        <div class="regist-input">
          <label for="starType"> 별자리 </label>
          <b-form-select
            id="starType"
            v-model="info.starId"
            :options="starOptions"
          ></b-form-select>
        </div>
      </div>
      <button id="regist-button" @click="registSsafit">등록</button>
      <div>
        <span>이미 회원이라면?</span>
        <a href="/">이미 회원입니다</a>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "registView",
  data() {
    return {
      mbtiOptions: [
        { text: "당신의 MBTI를 선택해주세요", disabled: true },
        { text: "ESTJ", value: "ESTJ" },
        { text: "ISTJ", value: "ISTJ" },
        { text: "ENTJ", value: "ENTJ" },
        { text: "INTJ", value: "INTJ" },
        { text: "ESFJ", value: "ESFJ" },
        { text: "ISFJ", value: "ISFJ" },
        { text: "ESTP", value: "ESTP" },
        { text: "ISTP", value: "ISTP" },
        { text: "ENFJ", value: "ENFJ" },
        { text: "INFJ", value: "INFJ" },
        { text: "ESFP", value: "ESFP" },
        { text: "ISFP", value: "ISFP" },
        { text: "ENTP", value: "ENTP" },
        { text: "INTP", value: "INTP" },
        { text: "ENFP", value: "ENFP" },
        { text: "INFP", value: "INFP" },
      ],
      starOptions: [
        { text: "당신의 별자리를 선택해주세요", disabled: true },
        { text: "양자리", value: 3 },
        { text: "황소자리", value: 4 },
        { text: "쌍둥이자리", value: 5 },
        { text: "게자리", value: 6 },
        { text: "사자자리", value: 7 },
        { text: "처녀자리", value: 8 },
        { text: "천칭자리", value: 9 },
        { text: "전갈자리", value: 10 },
        { text: "사수자리", value: 11 },
        { text: "염소자리", value: 12 },
        { text: "물병자리", value: 1 },
        { text: "물고기자리", texvaluet: 2 },
      ],
      info: {
        userId: "",
        userPass: "",
        userName: "",
        nickname: "",
        birth: "",
        mbti: "",
        email: "",
        starId: "",
      },
    };
  },
  methods: {
    registSsafit() {
      this.$store.dispatch("userRegist", this.info);
    },
  },
};
</script>

<style>
#RegistPage {
  width: 100%;
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: rgb(248, 248, 248);
}
#Regist {
  width: 700px;
  height: 600px;
  background-color: rgb(255, 255, 255);
  border-radius: 1rem;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  box-shadow: rgba(6, 24, 44, 0.4) 0px 0px 0px 2px,
    rgba(6, 24, 44, 0.65) 0px 4px 6px -1px,
    rgba(255, 255, 255, 0.08) 0px 1px 0px inset;
}
#regist-inputs {
  display: flex;
  flex-direction: column;
  align-items: right;
}
.regist-input {
  display: flex;
  margin: 7px;
}
.regist-input > label {
  width: 70px;
}
.birth-container {
  width: 300px;
  text-align: center;
}
#regist-button {
  width: 70px;
  margin-top: 10px;
  margin-bottom: 10px;
}
#Regist a {
  text-decoration: none;
  color: rgb(220, 53, 69);
  margin-left: 10px;
}
</style>

import axios from "axios";
import Vue from "vue";
import Vuex from "vuex";
import router from "../router";

Vue.use(Vuex);

const USER_REST_API = `http://localhost:8058/userapi`;
const SKY_REST_API = `http://localhost:8058/skyapi`;
// const SKY_SEQ = this.state.userSeq;

export default new Vuex.Store({
  state: {
    userNickname: "",
    userSuccess: "",
    userToday: "",
    userLuck: "",
    userStar: "",
    userSeq: "",
    skyBoards: [],
    infos: [],
    userMeditation: [],
    timers: [],
    video: "",
  },
  getters: {},
  mutations: {
    CREATE_SKY(state, payload) {
      state.skyBoards.push(payload);
    },
    GET_SKY(state, payload) {
      state.skyBoards = payload;
      // console.log(state.skyBoards);
    },
    GET_TIME(state, payload) {
      state.timers = payload;
      // console.log(state.skyBoards);
    },
    GET_VIDEO(state, payload) {
      state.video = payload;
      // console.log(state.skyBoards);
    },
    GET_USERNICKNAME(state, payload) {
      state.userNickname = payload;
    },
    GET_SUCCESS(state, payload) {
      state.userSuccess = payload;
    },
    GET_TODAY(state, payload) {
      state.userToday = payload;
    },
    GET_LUCK(state, payload) {
      state.userLuck = payload;
    },
    GET_STAR(state, payload) {
      state.userStar = payload;
    },
    GET_SEQ(state, payload) {
      state.userSeq = payload;
    },
    USER_MEDITATION(state, payload) {
      state.userMeditation.push(payload);
    },
    // DELETE_SKYBOARD(state, payload) {
    //   state.skyBoards.push(payload);
    // },
  },
  actions: {
    createSky({ commit }, frm) {
      // const API_URL = `${SKY_REST_API}/sky`;
      // console.log(API_URL);
      // axios({
      //   url: API_URL,
      //   method: "POST",
      //   params: frm,
      //   headers: {
      //     "access-token": sessionStorage.getItem("access-token"),
      //     // "Content-Type": "multipart/form-data",
      //   },
      // })
      // .then(() => {
      commit("CREATE_SKY", frm);
      // router.push("/skyBoard");///
      // })
      //     .catch((err) => {
      //       console.log(err);
      //     });
    },
    sendTime({ commit }, todayTime) {
      const API_URL = "http://localhost:8058/timeapi/timer";
      axios({
        url: API_URL,
        method: "POST",
        params: todayTime,
        headers: {
          "access-token": sessionStorage.getItem("access-token"),
        },
      })
        .then(() => {
          commit("USER_MEDITATION");

          window.open("http://localhost:8080/skyBoard");
          alert("오늘의 명상이 완료되었습니다.");
        })
        .catch((err) => {
          console.log(err);
        });
    },
    getTime({ commit }, userSeq) {
      const API_URL = `http://localhost:8058/timeapi/timer/${userSeq}`;
      axios({
        url: API_URL,
        method: "GET",
        headers: {
          "access-token": sessionStorage.getItem("access-token"),
        },
      })
        .then((res) => {
          console.log(res);
          commit("GET_TIME", res.data);
        })
        .catch((err) => {
          console.log(err);
        });
    },
    getVideo({ commit }) {
      const API_URL = "http://localhost:8058/timeapi/timer";
      axios({
        url: API_URL,
        method: "GET",
        headers: {
          "access-token": sessionStorage.getItem("access-token"),
        },
      })
        .then((res) => {
          console.log(res);
          commit("GET_VIDEO", res.data);
        })
        .catch((err) => {
          console.log(err);
        });
    },
    getSkyBoards({ commit }, userSeq) {
      const API_URL = `${SKY_REST_API}/sky/${userSeq}`;
      axios({
        url: API_URL,
        method: "GET",
        headers: {
          "access-token": sessionStorage.getItem("access-token"),
        },
      })
        .then((res) => {
          console.log(res);
          commit("GET_SKY", res.data);
        })
        .catch((err) => {
          console.log(err);
        });
    },
    sendDonate({ commit }, userSeq) {
      const API_URL = `http://localhost:8058/mypageapi/${userSeq}`;
      console.log(userSeq);
      axios({
        url: API_URL,
        method: "POST",
        headers: {
          "access-token": sessionStorage.getItem("access-token"),
        },
      })
        .then((res) => {
          console.log(res);

          alert("기부가 완료되었습니다");
          commit;
        })
        .catch((err) => {
          console.log(err);
        });
    },
    userRegist({ commit }, info) {
      const API_URL = `${USER_REST_API}/user`;
      axios({
        url: API_URL,
        method: "POST",
        params: info,
      })
        .then(() => {
          commit("USER_REGIST");
          alert("회원가입이 성공적으로 완료되었습니다.");
          router.push({ name: "login" });
        })
        .catch((err) => {
          console.log(err);
        });
    },
    userLogin({ commit }, user) {
      const API_URL = `${USER_REST_API}/login`;
      axios({
        url: API_URL,
        method: "GET",
        params: user,
      })
        .then((res) => {
          console.log(res);
          // commit("USER_LOGIN");
          sessionStorage.setItem("access-token", res.data["access-token"]);
          sessionStorage.setItem("nickname", res.data["nickname"]);
          sessionStorage.setItem("today", res.data["today"]);
          sessionStorage.setItem("success", res.data["success"]);
          sessionStorage.setItem("luck", res.data["luck"]);
          sessionStorage.setItem("userStar", res.data["userStar"]);
          sessionStorage.setItem("userSeq", res.data["userSeq"]);
          commit("GET_USERNICKNAME", res.data["nickname"]);
          commit("GET_SUCCESS", res.data["success"]);
          commit("GET_TODAY", res.data["today"]);
          commit("GET_LUCK", res.data["luck"]);
          commit("GET_STAR", res.data["userStar"]);
          commit("GET_SEQ", res.data["userSeq"]);
          alert("로그인에 성공하였습니다");
          router.push({ name: "mypage" });
        })
        .catch((err) => {
          console.log(err);
          alert("로그인에 실패하였습니다");
        });
    },
    userLogout() {
      console.log("왔니?");
      sessionStorage.clear();
      router.push({ name: "login" });
    },
  },
  modules: {},
});

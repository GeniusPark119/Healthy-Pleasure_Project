<template>
  <div id="Meditation">
    <header-nav></header-nav> <router-view />
    <h4 class="title">명상</h4>

    <div id="meditation-videotimer">
      <iframe
        width="560"
        height="315"
        :src="`${video}`"
        title="YouTube video player"
        frameborder="0"
        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
        allowfullscreen
      ></iframe>
      <div id="videotimer_ListTimer">
        <div id="videotimer_ListTimer-Timer">
          <stopwatch />
        </div>
        <div id="videotimer_ListTimer-List">
          <h3>명상보기 기록</h3>
          <hr />
          <table>
            <tr>
              <th></th>
              <th>날짜</th>
              <th>명상시간</th>
            </tr>
            <tr v-for="timer in timers" :key="timer.timerSeq">
              <td>
                <img id="rainbow-icon" src="@/assets/meditation.png" />
              </td>
              <td>{{ timer.regDate }}</td>
              <td>{{ timer.time }}</td>
              <!-- <a :href="">사진</a> -->
            </tr>
          </table>
        </div>
      </div>
    </div>

    <div id="meditation-buttons">
      <a href="/mypage">
        <button
          to="/mypage"
          style="width: 150px; float: none; margin: 0 auto"
          class="btn btn-outline-dark"
        >
          마이페이지
        </button>
      </a>
      <button
        style="width: 150px; float: none; margin: 0 auto"
        class="btn btn-outline-dark"
        @click="redirectVideo"
      >
        <span>다른 영상 볼래요</span>
      </button>
    </div>
  </div>
</template>

<script>
import { mapState } from "vuex";
import HeaderNav from "../components/common/HeaderNav.vue";

// import HelloWorld from "./components/HelloWorld";
import Stopwatch from "../components/StopWatch.vue";

export default {
  name: "MeditationView",
  computed: {
    ...mapState(["timers"]),
    ...mapState(["video"]),
  },
  components: {
    // HelloWorld,

    Stopwatch,
    HeaderNav,
  },

  data() {
    return {
      running: true,
    };
  },
  created() {
    let userSeq = sessionStorage.getItem("userSeq");
    this.$store.dispatch("getTime", userSeq);
    this.$store.dispatch("getVideo");
  },
  methods: {
    redirectVideo() {
      this.$router.go();
    },
  },
};
</script>

<style>
header-nav {
  position: absolute;
  top: 0px;
}
.title {
  margin-top: 30px;
  margin-bottom: 30px;
}

#meditation-videotimer {
  display: flex;
}
#videotimer_ListTimer {
  display: flex;
  align-items: center;
  margin-left: 80px;
}
#videotimer_ListTimer-Timer {
  margin-right: 80px;
}
#Meditation {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
}
#meditation-buttons {
  margin-top: 30px;
  display: flex;
  justify-content: center;
}
#meditation-buttons a {
  margin-right: 30px;
}
#rainbow-icon {
  width: 35px;
  height: 35px;
}
</style>

<template>
  <div>
    <p>{{ time | secondsInMinutes }}</p>
    <stopwatch :running="running" :resetWhenStart="true" />
    <button @click="startT">시작</button>
    <button @click="stopT">멈춤</button>
    <button @click="saveT">저장</button>
  </div>
</template>

<script>
import moment from "moment";

export default {
  name: "stopWatch",
  props: {
    running: {
      type: Boolean,
      default: false,
    },
    resetWhenStart: {
      type: Boolean,
      default: false,
    },
    restWhenStop: {
      type: Boolean,
      default: false,
    },
  },
  watch: {
    running: function (newVal) {
      if (newVal) this.startT();
      else this.stopT();
    },
  },
  //   mounted() {
  //     if (this.running) this.startT();
  //   },
  data() {
    return { time: 0, timer: null };
  },
  methods: {
    startT: function () {
      if (this.resetWhenStart) this.resetT();
      this.timer = setInterval(() => {
        this.time++;
      }, 1000);
    },
    resetT: function () {
      this.time = 0;
    },
    stopT: function () {
      clearInterval(this.timer);
      if (this.restWhenStop) this.resetT();
    },
    saveT: function () {
      let todayTime = {
        time: this.time,
        userSeq: sessionStorage.getItem("userSeq"),
      };
      console.log(todayTime);
      this.$store.dispatch("sendTime", todayTime);
      this.resetT();
      this.$router.go();
    },
  },
  filters: {
    secondsInMinutes: function (seconds) {
      return moment("2015-01-01")
        .startOf("day")
        .seconds(seconds)
        .format("HH:mm:ss");
    },
  },
};
</script>

<style scoped>
p {
  font-weight: bold;
  font-size: x-large;
}
</style>

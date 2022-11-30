<template>
  <div id="SkyCreate">
    <div id="SkyCreate-create">
      <h3>하늘보기</h3>
      <form id="SkyCreate-create-form" enctype="multipart/form-data">
        <label for="title"> 제목 </label>
        <input type="text" id="title" v-model="title" /><br />
        <label for="content"> 내용 </label>
        <textarea type="text" rows="10" id="content" v-model="content" /><br />
        <label for="img">사진 업로드</label>
        <input accept="image/*" type="file" id="img" value="img" />

        <button
          @click="createSky"
          style="width: 130px; height: 30px; float: none; margin: 0 auto"
          class="btn btn-outline-dark"
          id="button-gomedi"
        >
          등록
        </button>
      </form>
      <a href="/skyBoard" id="goSkyList"
        ><button
          style="width: 130px; height: 30px; float: none; margin: 0 auto"
          class="btn btn-outline-dark"
          id="button-gomedi"
        >
          목록보기
        </button></a
      >
    </div>
  </div>
</template>

<script>
import { mapState } from "vuex";
import axios from "axios";

export default {
  name: "SkyCreate",
  data() {
    return {
      title: "",
      content: "",
      img: "",
    };
  },
  computed: {
    ...mapState(["userSeq"]),
  },
  methods: {
    createSky() {
      var frm = new FormData();
      var photofile = document.getElementById("img");
      frm.append("img", photofile.files[0]);
      frm.append("title", this.title);
      frm.append("content", this.content);
      frm.append("userSeq", sessionStorage.getItem("userSeq"));

      // let skyInfo = {
      //   userSeq: 7,
      //   title: this.title,
      //   content: this.content,
      //   img: frm,
      // };
      axios
        .post("http://localhost:8058/skyapi/sky", frm, {
          headers: {
            // "Content-Type": "multipart/form-data",
            "access-token": sessionStorage.getItem("access-token"),
          },
        })
        .then(function () {
          console.log("통과");
        })
        .catch(function () {
          console.log("2");
        });

      this.$store.dispatch("createSky", frm);
      this.$router.push("/skyBoard");
      this.$router.go();
    },
  },
};
</script>

<style>
#SkyCreate {
  width: 100%;
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: rgb(248, 248, 248);
}
#SkyCreate-create {
  width: 800px;
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
#SkyCreate-create-form {
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 700px;
}
.file-label {
  margin-top: 30px;
  background-color: #5b975b;
  color: #fff;
  text-align: center;
  padding: 10px 0;
  width: 65%;
  border-radius: 6px;
  cursor: pointer;
}
.file {
  display: none;
}
#create-buttons {
  display: flex;
  align-items: center;
  margin-top: 20px;
}
#goSkyList {
  margin-top: 20px;
}
</style>

<template>
  <div id="SkyList">
    <div id="SkyList_list">
      <h3>하늘보기 기록</h3>
      <hr />
      <div>
        <table>
          <tr>
            <th></th>
            <th>등록일</th>
            <th>제목</th>
            <th>내용</th>
            <th>사진</th>
          </tr>
          <tr v-for="skyBoard in skyBoards" :key="skyBoard.skySeq">
            <td>
              <img id="rainbow-icon" src="@/assets/clouds.jpg" />
            </td>
            <td>{{ skyBoard.regDate }}</td>
            <td>{{ skyBoard.title }}</td>
            <td>{{ skyBoard.content }}</td>
            <a :href="`http://localhost:8058/skyapi/upload/${skyBoard.imgName}`"
              ><button
                style="width: 60px; height: 30px; float: none; margin: 0 auto"
                class="btn btn-outline-info"
                id="button-gomedi"
              >
                사진
              </button></a
            >
            <!-- <button to="/update">수정</button> -->
            <!-- <a :href="">사진</a> -->
          </tr>
        </table>
      </div>
      <div id="SkyList-buttons">
        <a href="/mypage"
          ><button
            style="width: 130px; height: 30px; float: none; margin: 0 auto"
            class="btn btn-outline-dark"
            id="button-gomedi"
          >
            마이페이지
          </button></a
        >
        <a href="/skyBoard/create"
          ><button
            style="width: 130px; height: 30px; float: none; margin: 0 auto"
            class="btn btn-outline-dark"
            id="button-gomedi"
          >
            작성하기
          </button></a
        >
      </div>
    </div>
  </div>
</template>

<script>
import { mapState } from "vuex";
export default {
  name: "SkyList",
  computed: {
    ...mapState(["skyBoards"]),
    ...mapState(["userSeq"]),
    // showImg():{
    //   a : skyBoards.imgUri;
    // }
    // photo: skyBoard.imgUri,
  },
  created() {
    let userSeq = sessionStorage.getItem("userSeq");
    this.$store.dispatch("getSkyBoards", userSeq);
  },
  methods: {
    sendUri() {
      this.$store.dispatch("sendUri");
    },
    goMypage() {},
  },
};
</script>

<style scoped>
#SkyList {
  width: 100%;
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: rgb(248, 248, 248);
}
#SkyList_list {
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
table {
  width: 600px;
  height: 400px;
}
#rainbow-icon {
  width: 35px;
  height: 35px;
}

#SkyList-buttons a {
  margin-left: 20px;
  margin-right: 20px;
}
</style>

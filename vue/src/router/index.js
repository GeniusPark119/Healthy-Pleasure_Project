import Vue from "vue";
import VueRouter from "vue-router";
import MypageView from "../views/MypageView.vue";
import LoginView from "../views/LoginView.vue";
import RegistView from "../views/RegistView.vue";
import SkyView from "../views/SkyView.vue";
import SkyList from "../components/skyBoard/SkyList.vue";
import SkyCreate from "../components/skyBoard/SkyCreate.vue";
import WalkView from "../views/WalkView.vue";
import WalkList from "../components/walkBoard/WalkList.vue";
import MealView from "../views/MealView.vue";
import MealList from "../components/mealBoard/MealList.vue";
import MeditationView from "../views/MeditationView.vue";
import SkyUpdate from "../components/skyBoard/SkyUpdate.vue";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "login",
    component: LoginView,
  },
  {
    path: "/mypage",
    name: "mypage",
    component: MypageView,
  },
  {
    path: "/regist",
    name: "regist",
    component: RegistView,
  },
  {
    path: "/skyBoard",
    component: SkyView,
    children: [
      {
        path: "",
        name: "skyList",
        component: SkyList,
      },
      {
        path: "create",
        name: "skyCreate",
        component: SkyCreate,
      },
      {
        path: "update",
        name: "skyUpdate",
        component: SkyUpdate,
      },
    ],
  },
  {
    path: "/walkboard",
    component: WalkView,
    children: [
      {
        path: "",
        name: "walkList",
        component: WalkList,
      },
    ],
  },
  {
    path: "/mealboard",
    component: MealView,
    children: [
      {
        path: "",
        name: " mealList",
        component: MealList,
      },
    ],
  },
  {
    path: "/meditation",
    name: "meditation",
    component: MeditationView,
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;

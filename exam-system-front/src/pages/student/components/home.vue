<template>
  <div class="home">
    <background :ball_color="ball_color" :bg_color="bg_color"></background>
    <div class="content">
      <el-col class="row-bg">
        <el-col class="hidden-md-and-down" :span="5">
          <leftContent />
        </el-col>
        <el-col :span="19">
          <rightContent />
        </el-col>
      </el-col>
    </div>
  </div>
</template>

<script>
import background from "../../../component/base/background";
import leftContent from "./leftContent";
import rightContent from "./rightContent";

export default {
  components: {
    leftContent,
    rightContent,
    background
  },
  data() {
    return {
      ball_color: {
        //小球颜色
        r: 64,
        g: 158,
        b: 255
      },
      bg_color: "rgba(236, 245, 255,0.3)" //背景颜色
    };
  },
  created() {
    document.title="首页"
  },
};
</script>

<style scoped>
.content {
  margin-top: 5px;
  padding: 10px;
  background-color: rgba(255,255,255,0.75);
  height:100%;
}
</style>
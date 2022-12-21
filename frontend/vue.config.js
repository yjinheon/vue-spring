const { defineConfig } = require('@vue/cli-service')
const path = require("path");

module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    proxy : 'http://localhost:8081' // 프록시 설정을 통해 Vue 개발용 서버가 처리하지 못하는 요청을 8081 포트로 요청
  },
  indexPath: '../../templates/vue/index.html',
  publicPath: '/vue',
  outputDir: path.resolve(__dirname, "../src/main/resources/static/vue")

})

const base = {
    get() {
        return {
            url : "http://localhost:8080/zhinengxiaochengxsc/",
            name: "zhinengxiaochengxsc",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zhinengxiaochengxsc/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智能小程序商城"
        } 
    }
}
export default base

流量染色，灰度发布。<br>
1：前端->网关->服务（稳定 or 灰度）

2：通过全局过滤器进行流量染色，对请求进行稳定还是灰度的染色；

3：后续通过自定义lb均衡器进行nacos版本服务实例的切换。
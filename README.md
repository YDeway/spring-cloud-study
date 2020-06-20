# spring-cloud-study
# 启动顺序
* 注册中心 -> 配置中心 -> 生产者 —> 消费者 -> 网关 -> 监控

# Eureka(Deprecated)
## 替代方案： Sentinel、Nacos
&emsp;&emsp;用于服务注册与发现

# Netflix/Hystrix(Deprecated)
## 替代方案： consul
&emsp;&emsp;用于服务熔断、限流、降级

# Spring Config
&emsp;&emsp;配置中心

# 负载均衡
## 服务端负载均衡

## 客户端负载均衡
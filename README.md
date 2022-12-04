# Spring Cloud Alibaba Demo

Spring Cloud 的示例代码应用

## Part1. Spring Cloud + Nacos

参考文章: https://www.lingluoyun.com/spring/spring-cloud-alibaba/nacos-springcloudalibaba

### module 简介

- **spring-cloud-alibaba-provider-8001**: 服务提供者（Provider Service）, 一个 Nacos Client，用于对外服务。它将自己提供的服务注册到服务注册中心，以供服务消费者发现和调用。端口 8001
- **spring-cloud-alibaba-consumer-nacos-8801**: 服务消费者（Consumer Service）：它是一个 Nacos Client，用于消费服务。它可以从服务注册中心获取服务列表，调用所需的服务。端口 8801
- **spring-cloud-alibaba-config-client-3377**: 配置中心，对 Spring Cloud 应用的外部配置进行统一地集中化管理。端口 3377

### 访问 URL 测试

- 启动 spring-cloud-alibaba-provider-8001，使用浏览器访问 http://localhost:8001/dept/nacos/1
- 启动 spring-cloud-alibaba-consumer-nacos-8801，查看 Nacos Server 的服务列表，访问 http://localhost:8801/consumer/dept/nacos/1
- 启动 spring-cloud-alibaba-config-client-3377，并使用浏览器访问 http://localhost:3377/config/info

## Part2. Spring Cloud + Sentinel

参考文章: https://www.lingluoyun.com/spring/spring-cloud-alibaba/sentinel-springcloudalibaba/

Sentinel 的开发流程如下：

1.  **引入 Sentinel 依赖**：在项目中引入 Sentinel 的依赖，将 Sentinel 整合到项目中；
2.  **定义资源**：通过对主流框架提供适配或 Sentinel 提供的显式 API 和注解，可以定义需要保护的资源，此外 Sentinel 还提供了资源的实时统计和调用链路分析；
3.  **定义规则**：根据实时统计信息，对资源定义规则，例如流控规则、熔断规则、热点规则、系统规则以及授权规则等。
4.  **检验规则是否在生效**：运行程序，检验规则是否生效，查看效果。

### module 简介

- **spring-cloud-alibaba-sentinel-service-8401**: Sentinel 流量控制
- **spring-cloud-alibaba-provider-mysql-8003**: Sentinel 熔断机制实战-服务提供者
- **spring-cloud-alibaba-consumer-mysql-8803**: Sentinel 熔断机制实战-服务消费者
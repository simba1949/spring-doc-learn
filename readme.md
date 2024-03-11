# 相关链接
- spring-doc 官网：https://springdoc.org/
- spring-doc github：https://github.com/springdoc/springdoc-openapi

# 核心依赖

https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-starter-webmvc-ui

```xml
<!-- https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-starter-webmvc-ui -->
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.3.0</version>
</dependency>
```



# 访问路径

访问 swagger-ui 路径：

格式：`http://{host}:{port}/{server.servlet.context-path}/swagger-ui.html`

示例：http://localhost:8080/swagger-ui.html

访问 OpenAPI JSON 描述路径：

格式：`http://{host}:{port}/{server.servlet.context-path}/v3/api-docs` 

示例：http://localhost:8080/v3/api-docs
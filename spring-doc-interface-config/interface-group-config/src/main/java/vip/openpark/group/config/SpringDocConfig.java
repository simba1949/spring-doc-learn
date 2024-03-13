package vip.openpark.group.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * springdoc 使用注册配置的配置类
 *
 * @author anthony
 * @version 2024/3/11 15:34
 */
@Configuration
public class SpringDocConfig {
	
	@Bean
	public GroupedOpenApi userApi() {
		return GroupedOpenApi.builder()
			       .group("user")
			       .pathsToMatch("/user/**")
			       .build();
	}
	
	@Bean
	public GroupedOpenApi adminApi() {
		return GroupedOpenApi.builder()
			       .group("admin")
			       .pathsToMatch("/admin/**")
			       .build();
	}
}
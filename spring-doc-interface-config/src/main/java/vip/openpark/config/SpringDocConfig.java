package vip.openpark.config;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

/**
 * @author anthony
 * @version 2024/3/11 17:12
 */
@OpenAPIDefinition(
	info = @Info(
		title = "SpringDoc Quick Start", // API 接口文档标题
		description = "SpringDoc Quick Start", // API 接口文档描述
		version = "1.0.0", // API 接口文档版本
		termsOfService = "https://github.com/simba1949", // API 接口文档条款服务
		contact = @Contact(
			name = "anthony", // 联系人名称
			email = "openpark.vip@outlook.com", // 联系人邮箱
			url = "https://github.com/simba1949" // 联系人网址
		),
		license = @License(
			name = "Apache 2.0", // API 接口文档许可证名称
			url = "https://www.apache.org/licenses/LICENSE-2.0.html" // API 接口文档许可证网址
		)
	),
	externalDocs = @ExternalDocumentation(
		description = "spring-doc-learn GitHub", // API 接口文档外部描述
		url = "https://github.com/simba1949/spring-doc-learn" // API 接口文档外部网址
	)
)
public class SpringDocConfig {
}

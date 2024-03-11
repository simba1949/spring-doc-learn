package vip.openpark.config.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author anthony
 * @version 2024/3/11 15:52
 */
@Configuration
public class SpringDocConfig {
	
	@Bean
	public OpenAPI openAPI() {
		OpenAPI openAPI = new OpenAPI();
		openAPI.setInfo(info());
		openAPI.setExternalDocs(externalDocs());
		return openAPI;
	}
	
	private Info info() {
		Info info = new Info();
		info.setTitle("SpringDoc Quick Start"); // API 接口文档标题
		info.setDescription("SpringDoc Quick Start"); // API 接口文档描述
		info.setVersion("1.0.0"); // API 接口文档版本
		info.setTermsOfService("https://github.com/simba1949"); // API 接口文档条款服务
		
		// API 接口文档联系人信息
		Contact contact = new Contact();
		contact.setName("anthony");
		contact.setEmail("openpark.vip@outlook.com");
		contact.setUrl("https://github.com/simba1949");
		info.setContact(contact);
		
		// API 接口文档许可证信息
		License license = new License();
		license.setName("Apache 2.0"); // API 接口文档许可证名称
		license.setUrl("https://www.apache.org/licenses/LICENSE-2.0.html"); // API 接口文档许可证网址
		info.setLicense(license);
		
		return info;
	}
	
	private ExternalDocumentation externalDocs() {
		ExternalDocumentation externalDocumentation = new ExternalDocumentation();
		externalDocumentation.setDescription("spring-doc-learn GitHub"); // API 接口文档外部描述
		externalDocumentation.setUrl("https://github.com/simba1949/spring-doc-learn"); // API 接口文档外部网址
		return externalDocumentation;
	}
}
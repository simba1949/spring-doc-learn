package vip.openpark.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author anthony
 * @version 2024/3/11 15:50
 */
@SpringBootApplication
public class BeanConfigApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(BeanConfigApplication.class).run(args);
	}
}
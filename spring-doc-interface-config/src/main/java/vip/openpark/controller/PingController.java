package vip.openpark.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anthony
 * @version 2024/3/11 15:45
 */
@RestController
public class PingController {
	@GetMapping("ping")
	public String ping() {
		return "pong";
	}
}
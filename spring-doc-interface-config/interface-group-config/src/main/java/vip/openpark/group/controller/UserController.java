package vip.openpark.group.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anthony
 * @version 2024/3/13 9:34
 */
@RestController
@RequestMapping("user")
public class UserController {
	
	@GetMapping("hello")
	public String hello(String name) {
		return "hello" + name;
	}
}
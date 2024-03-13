package vip.openpark.group.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anthony
 * @version 2024/3/13 9:33
 */
@RestController
@RequestMapping("admin")
public class AdminController {
	@GetMapping("hello")
	public String hello() {
		return "hello admin";
	}
}
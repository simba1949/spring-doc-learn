package vip.openpark.example.controller;

import org.springframework.web.bind.annotation.*;
import vip.openpark.example.domain.request.UserInsertRequest;
import vip.openpark.example.domain.request.UserUpdateRequest;
import vip.openpark.example.domain.response.UserResponse;

import java.util.Collections;
import java.util.List;

/**
 * @author anthony
 * @version 2024/3/11 17:18
 */
@RestController
@RequestMapping("user")
public class UserController {
	
	@PostMapping
	public String insert(@RequestBody UserInsertRequest userInsertRequest) {
		return "success";
	}
	
	@PutMapping
	public String update(@RequestBody UserUpdateRequest userUpdateRequest) {
		return "success";
	}
	
	@DeleteMapping
	public String delete(String id) {
		return "success";
	}
	
	@GetMapping("{id}")
	public UserResponse get(@PathVariable(name = "id") String id) {
		return null;
	}
	
	@GetMapping
	public List<UserResponse> list(String id) {
		return Collections.emptyList();
	}
}
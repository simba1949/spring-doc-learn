package vip.openpark.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.openpark.domain.request.UserInsertRequest;
import vip.openpark.domain.request.UserUpdateRequest;
import vip.openpark.domain.response.UserResponse;

import java.util.List;

/**
 * @author anthony
 * @version 2024/3/11 17:18
 */
@RestController
@RequestMapping("user")
public class UserController {
	
	public String insert(@RequestBody UserInsertRequest userInsertRequest) {
		return "success";
	}
	
	public String update(@RequestBody UserUpdateRequest userUpdateRequest) {
		return "success";
	}
	
	public String delete(String id) {
		return "success";
	}
	
	public UserResponse get(String id) {
		return null;
	}
	
	public List<UserResponse> list(String id) {
		return null;
	}
}
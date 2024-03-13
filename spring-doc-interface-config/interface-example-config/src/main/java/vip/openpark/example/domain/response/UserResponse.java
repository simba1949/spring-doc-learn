package vip.openpark.example.domain.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author anthony
 * @version 2024/3/11 17:22
 */
@Getter
@Setter
@ToString
public class UserResponse implements Serializable {
	private static final long serialVersionUID = -2906420256239154473L;
	
	private Long id;
	
	private String username;
	private String email;
	private LocalDateTime birthday;
}
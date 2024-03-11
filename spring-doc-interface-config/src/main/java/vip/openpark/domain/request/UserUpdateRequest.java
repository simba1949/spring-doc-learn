package vip.openpark.domain.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author anthony
 * @version 2024/3/11 17:19
 */
@Getter
@Setter
@ToString
public class UserUpdateRequest implements Serializable {
	private static final long serialVersionUID = -3458896978151111228L;
	
	private Long id;
	
	private String username;
	private String password;
	private String email;
	private LocalDateTime birthday;
}
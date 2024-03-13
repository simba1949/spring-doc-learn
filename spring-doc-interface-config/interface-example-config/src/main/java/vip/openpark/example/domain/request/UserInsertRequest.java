package vip.openpark.example.domain.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author anthony
 * @version 2024/3/11 17:13
 */
@Getter
@Setter
@ToString
public class UserInsertRequest implements Serializable {
	private static final long serialVersionUID = -8088880586781399307L;
	
	private String username;
	private String password;
	private String email;
	private LocalDateTime birthday;
}
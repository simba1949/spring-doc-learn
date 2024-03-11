package vip.openpark.domain.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author anthony
 * @version 2024/3/11 17:20
 */
@Getter
@Setter
@ToString
public class UserSelectRequest implements Serializable {
	private static final long serialVersionUID = -4835786336389350345L;
	
	private String username;
	private String email;
	private LocalDateTime birthdayStart;
	private LocalDateTime birthdayEnd;
}
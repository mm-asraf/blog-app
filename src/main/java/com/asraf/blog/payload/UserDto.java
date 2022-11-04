package com.asraf.blog.payload;



import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class UserDto {
	
	private int id;
	
	@NotEmpty
	@Size(min = 5,message="min character should be 5")
	@Pattern(regexp="[a-z]{3,12}", message = "First Name must not contains numbers or special characters")
	private String name;
	
	@NotEmpty
	@Email
	@Column(unique=true)
	@Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$",message = "email should not contain special character but valid email style will be fine")
	private String email;
	
	@NotEmpty
	@Size(min = 5,message="min character should be 5")
	private String password;
	
	@NotEmpty
	@Size(min = 10,message="min character should be 5")
	private String about;
	
}	

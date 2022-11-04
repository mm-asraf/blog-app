package com.asraf.blog.services;


import java.util.List;

import com.asraf.blog.payload.UserDto;



public interface UserService {
	
	UserDto createUser(UserDto user);
	
	UserDto updateUser(UserDto user,Integer userId);
	
	List<UserDto> getAllUser();
	
	UserDto getUserById(Integer userId);
	
	void deleteUser(Integer userId);
}

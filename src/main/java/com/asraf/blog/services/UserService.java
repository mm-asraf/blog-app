package com.asraf.blog.services;


import com.asraf.blog.payload.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto user);
	
	UserDto updateUser(UserDto user,Integer userId);
	
	UserDto getUserById(Integer userId);
	
	void deleteUser(Integer userId);
}

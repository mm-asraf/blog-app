package com.asraf.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asraf.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}

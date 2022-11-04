package com.asraf.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asraf.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}

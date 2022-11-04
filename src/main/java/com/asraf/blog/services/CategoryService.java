package com.asraf.blog.services;

import java.util.List;

import com.asraf.blog.payload.CategoryDto;

public interface CategoryService {
	
	//create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	
	//update
	CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
	
	//delete
	public void deleteCategory(Integer categoryId);
	
	//get by id
	public CategoryDto getCategory(Integer categoryId);
	
	//getAll
	List<CategoryDto> getCategoriesAll();

}

package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entity.Category;

public interface CategoryManager 
{
	List<Category> getAllCategories();
	List<Category> getCategoriesBySubCategory(String subCategory);
	Optional<Category> getCategoryById(int id);
	void saveCategories(List<Category> category);
	void saveCategory(Category category);
	void updateCategory(Category category);
	void deleteCategoryById(int id);
}
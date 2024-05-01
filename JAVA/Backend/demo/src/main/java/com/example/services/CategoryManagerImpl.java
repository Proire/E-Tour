package com.example.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Category;
import com.example.repositories.CategoryRepository;


@Service
public class CategoryManagerImpl implements CategoryManager {

	@Autowired
	CategoryRepository repository;

	// Getting all Categories
	public List<Category> getAllCategories() {
		return repository.findAll();
	}
	
	// Getting Categories by subcategory 
	public List<Category> getCategoriesBySubCategory(String subCategory)
	{
		return repository.findBySubCategory(subCategory);
	}
	
	// Getting Categories by id
	public Optional<Category> getCategoryById(int id)
	{
		return repository.findById(id);
	}
	
	// Adding a new category 
	public void saveCategory(Category category) {
		repository.save(category);     
	}
	
	// Adding new categories 
	public void saveCategories(List<Category> category) {
		repository.saveAll(category);     
	}
	
	// Updating a Category
	public void updateCategory(Category category)
	{
		repository.save(category);
	}
	
	// deleting a particular category by id 
	public void deleteCategoryById(int id) {
		repository.deleteById(id);
	}
}


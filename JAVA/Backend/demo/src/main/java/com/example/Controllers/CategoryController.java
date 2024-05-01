package com.example.Controllers;
import com.example.services.CategoryManager;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Category;

@RestController  
@CrossOrigin("http://localhost:3000")     // Http based mechanism that allows server to indicate any origin(domain, scheme, or port) other than its own from which a browser should permit loading resources.
@RequestMapping("api/")                   // base uri for each method
public class CategoryController {
	
	 @Autowired                                                                                                                                                           
	 CategoryManager manager;
	
	 @GetMapping(value ="categories")
	 public List<Category> getAllCategories()
	 {
		 return manager.getAllCategories();
	 }
	 
	 @GetMapping(value ="categories/{subCategory}")
	 public List<Category> getCategoriesBySubCategory(@PathVariable String subCategory)
	 {
		 return manager.getCategoriesBySubCategory(subCategory);
	 }
	 
	 @GetMapping(value ="category/{id}")
	 public Optional<Category> getCategoryById(@PathVariable int id)
	 {
		 return manager.getCategoryById(id);
	 }
	 
	 @PostMapping("category")
	 public void createCategory(@RequestBody Category category)
	 {
		 manager.saveCategory(category);
	 }
	 
	 @PostMapping("categories")
	 public void createCategories(@RequestBody List<Category> categories)
	 {
		 manager.saveCategories(categories);
	 }
	 
	 @PutMapping("category/{id}")
	 public void updateCategory(@PathVariable int id, @RequestBody Category category)
	 {
		 category.setId(id);
		 manager.updateCategory(category);
	 }
	 
	 @DeleteMapping("category/{id}")
	 public void deleteCategoryById(@PathVariable int id)
	 {
		 manager.deleteCategoryById(id);
	 }
}

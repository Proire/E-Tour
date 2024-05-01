package com.example.repositories;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;
import com.example.entity.Category;

@Repository
@Transactional
public interface CategoryRepository extends JpaRepository<Category,Integer>
{
	List<Category> findBySubCategory(String subCategory);
}

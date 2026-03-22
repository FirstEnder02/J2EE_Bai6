package J2EE_Bai6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import J2EE_Bai6.models.Category;
import J2EE_Bai6.repository.CategoryRepository;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    
    public List<Category> getAllCategories() { return categoryRepository.findAll(); }
    @SuppressWarnings("null")
    public void saveCategory(Category category) { categoryRepository.save(category); }
    @SuppressWarnings("null")
    public Category getCategoryById(Integer id) { return categoryRepository.findById(id).orElse(null); }
    @SuppressWarnings("null")
    public void deleteCategory(Integer id) { categoryRepository.deleteById(id); }
}
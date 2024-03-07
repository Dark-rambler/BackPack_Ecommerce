package com.posgrado.ecommerce.service;

import com.posgrado.ecommerce.entity.Category;
import com.posgrado.ecommerce.repository.CategoryRepository;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

  private CategoryRepository categoryRepository;



  @Override
  public Category getById(UUID id) {
     Category category =categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
     return category;
  }

  @Override
  public List<Category> getAll() {
    return categoryRepository.findAll();
  }
}

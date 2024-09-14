package com.example.Category_Product.service;

import com.example.Category_Product.entities.Category;
import org.springframework.http.ResponseEntity;

public interface CategoryService {
   public ResponseEntity<?> addCategory(Category category);

  public  ResponseEntity deleteCategory(Integer categoryId);

   public  ResponseEntity<?> updateCategory(Category category, Integer categoryId);

   public ResponseEntity<?> getCategory();

   public ResponseEntity<?> getById(Integer categoryId);
}

package com.springboot_blog_rest_api.repository;

import com.springboot_blog_rest_api.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

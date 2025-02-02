package com.vinisnzy.stock_control.repositories;

import com.vinisnzy.stock_control.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

package com.vinisnzy.stock_control.repositories;

import com.vinisnzy.stock_control.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

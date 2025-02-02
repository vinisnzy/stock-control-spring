package com.vinisnzy.stock_control.services;

import com.vinisnzy.stock_control.entities.Product;
import com.vinisnzy.stock_control.exceptions.ResourceNotFoundException;
import com.vinisnzy.stock_control.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException(id));
    }

    public Product create(Product product) {
        return repository.save(product);
    }

    public Product update(Long id, Product product) {
        Product entity = findById(id);
        updateData(entity, product);
        return repository.save(entity);
    }

    private void updateData(Product entity, Product product) {
        entity.setName(product.getName());
        entity.setDescription(product.getDescription());
        entity.setPrice(product.getPrice());
        entity.setStock(product.getStock());
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

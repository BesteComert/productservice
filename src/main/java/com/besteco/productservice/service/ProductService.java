package com.besteco.productservice.service;

import java.util.List;


import com.besteco.productservice.entity.Product;
import com.besteco.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;


    public Product addProduct(Product product) {

        return productRepository.save(product);
    }

    public Product updateProduct(Long id,Product newProduct) throws RuntimeException {

        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException(
        		"Product with id " + id + " not found."));

        productRepository.deleteById(id);
        product.setName(newProduct.getName());
        product.setUnitInStock(newProduct.getUnitInStock());
        product.setUnitPrice(newProduct.getUnitPrice());
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {

        productRepository.deleteById(id);
    }

    public List<Product> getAllProducts(){

        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product with id " + id + " not " +
                "found."));
    }


}

package com.besteco.productservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.besteco.productservice.entity.Product;
import com.besteco.productservice.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product postProduct(@RequestBody Product product) {

        return productService.addProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getProducts(){

        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@RequestParam Long id) {

        return productService.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(Long id) {

        productService.deleteProduct(id);
    }

    @PutMapping("/{id}")
    public Product putProduct(@RequestParam Long id, @RequestBody Product product) {

        return productService.updateProduct(id, product);
    }


}


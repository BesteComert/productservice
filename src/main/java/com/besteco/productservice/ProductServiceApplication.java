package com.besteco.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.besteco.controller, com.besteco.service, com.besteco.repository")
public class ProductServiceApplication{
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}
}
//	@Override
//	public void run(String... args) throws Exception {


//		Product product1 = new Product();
//		product1.setName("Buzdolabı");
//		product1.setUnitInStock(25);
//		product1.setUnitPrice(1399.99);
//
//		HashSet<Category> setCategory = new HashSet<Category>();
//		setCategory.add(category1);
//		product1.setFallIntoCategories(setCategory);
//
//		HashSet<Promotion> setPromotion = new HashSet<Promotion>();
//		setPromotion.add(promotion1);
//		setPromotion.add(promotion2);
//		product1.setFallIntoPromotions(setPromotion);
//
//		Product product2 = new Product();
//		product2.setName("Buzdolabı");
//		product2.setUnitInStock(25);
//		product2.setUnitPrice(1399.99);
//
//		HashSet<Category> setCategory2 = new HashSet<Category>();
//		setCategory2.add(category2);
//		product2.setFallIntoCategories(setCategory2);
//
//		HashSet<Promotion> setPromotion2 = new HashSet<Promotion>();
//		setPromotion2.add(promotion2);
//		product2.setFallIntoPromotions(setPromotion2);
//
//		productService.addProduct(product1);
//		productService.addProduct(product2);
//	}



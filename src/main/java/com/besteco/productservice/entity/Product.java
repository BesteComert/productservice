package com.besteco.productservice.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

import java.util.List;

@Data
@Document
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    //@Column(name = "id")
    private Long id;

    //@Column(name = "name")
    @Field
    private String name;

    @Field
    private Double unitPrice;

    @Field
    private Integer unitInStock;

    //@Column(name = "promotion")
    @Field
    private List<Integer> promotion;

    public Product(String name) {
        this.name = name;
    }
}

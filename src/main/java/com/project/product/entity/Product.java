package com.project.product.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Product {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
}

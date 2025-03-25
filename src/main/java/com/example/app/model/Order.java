package com.example.app.model;


import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
public class Order {
    private Long id;
    private String creationDate;
    private double totalCost;
    private List<Product> products;

    public Order(Long id, String creationDate, List<Product> products) {
        this.id = id;
        this.creationDate = creationDate;
        this.products = products;
        this.totalCost = calculateTotalCost();
    }

    private double calculateTotalCost() {
        if (products == null || products.isEmpty()) {
            return 0.0;
        }
        return products.stream()
                .mapToDouble(Product::getCost)
                .sum();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost() {
        this.totalCost = calculateTotalCost();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}

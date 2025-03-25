package com.example.app.dto;

import com.example.app.model.Product;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record OrderDtoRequest(Long id, String date, double totalCost, List<Product> products) {
}

package com.example.demo.model;


import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;

    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @NotNull(message = "Price cannot be empty")
    @DecimalMin(value = "0.01", message = "Price must be greater than 0")
    private double price;
    
}

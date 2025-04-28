package edu3431.matiukhin.softwarequal5.model;/*
@author sasha
@project SoftwareQuality5
@class Product
@version 1.0.0
@since 25.04.2025 - 08 - 48
*/

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
@Builder
@Document
public class Product {
    @Id
    private String id;
    private String category;
    private String type;
    private String name;
    private double price;
    private String code;
    private String description;

    public Product(String category, String type, String name, double price, String code, String description) {
        this.category = category;
        this.type = type;
        this.name = name;
        this.price = price;
        this.code = code;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product item)) return false;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
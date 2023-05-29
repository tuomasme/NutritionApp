package com.example.server.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ingredient {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long ingredientId;
    private double amount;
    private String unit;
    private int calories;
    @ManyToOne(fetch = LAZY)
    private Recipe recipe;
    @OneToMany(fetch = LAZY)
    private List<Nutrient> nutrients;
}

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
public class Recipe {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long recipeId;
    private String recipeName;
    @OneToMany(fetch = LAZY)
    private List<Ingredient> ingredients;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}

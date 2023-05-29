package com.example.server.repository;

import com.example.server.model.Ingredient;
import com.example.server.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
    List<Ingredient> findAllByRecipe(Recipe recipe);
}

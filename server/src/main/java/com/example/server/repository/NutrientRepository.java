package com.example.server.repository;

import com.example.server.model.Ingredient;
import com.example.server.model.Nutrient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NutrientRepository extends JpaRepository<Nutrient, Long> {
    List<Nutrient> findAllByIngredient(Ingredient ingredient);
}

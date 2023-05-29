package com.example.server.model;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Nutrient {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private double amount;
    @ManyToOne(fetch = LAZY)
    private Ingredient ingredient;
}

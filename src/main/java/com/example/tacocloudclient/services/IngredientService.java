package com.example.tacocloudclient.services;

import com.example.tacocloudclient.entities.Ingredient;

public interface IngredientService {
    Iterable<Ingredient> findAll();

    Ingredient addIngredient(Ingredient ingredient);
}

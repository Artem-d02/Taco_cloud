package com.example.taco_cloud.data;

import com.example.taco_cloud.Ingredient;
import org.springframework.data.relational.core.sql.In;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {}

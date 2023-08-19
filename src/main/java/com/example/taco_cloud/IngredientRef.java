package com.example.taco_cloud;

import lombok.Data;

@Data
public class IngredientRef {
    private final String ingredient;
    private final long tacoId;
    private final long tacoKey;
}

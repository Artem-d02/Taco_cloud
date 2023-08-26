package com.example.taco_cloud;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Taco {
    @NotNull
    @Size(min = 5, message = "Name should be longer then 5 symbols")
    private String name;

    @NotNull
    @Size(min = 1, message = "Taco should contain at least 1 ingredient")
    private List<Ingredient> ingredients = new ArrayList<>();

    private Date createdAt = new Date();

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }
}

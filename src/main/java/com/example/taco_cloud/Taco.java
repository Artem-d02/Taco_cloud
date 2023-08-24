package com.example.taco_cloud;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;
import java.util.List;

@Data
@Table
public class Taco {
    @NotNull
    @Size(min = 5, message = "Name should be longer then 5 symbols")
    private String name;

    @NotNull
    @Size(min = 1, message = "Taco should contain at least 1 ingredient")
    private List<Ingredient> ingredients;

    @Id
    private Long id;
    private Date createdAt = new Date();
}

package com.bp.emazon.stock.aplication.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class CreateCategoryRequest {

    @NotBlank
    private String name;
    @NotBlank
    private String description;

}

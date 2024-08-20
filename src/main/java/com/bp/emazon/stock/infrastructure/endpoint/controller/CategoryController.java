package com.bp.emazon.stock.infrastructure.endpoint.controller;

import com.bp.emazon.stock.aplication.dto.CreateCategoryRequest;
import com.bp.emazon.stock.domain.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // x2
@RequiredArgsConstructor // Investigar bien sobre esto.
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping("/category")
    public String create(@RequestBody CreateCategoryRequest body){
        return categoryService.createCategory(body);
    }
}

package com.bp.emazon.stock.domain.service;

import com.bp.emazon.stock.aplication.dto.CreateCategoryRequest;
import com.bp.emazon.stock.infrastructure.persistence.entity.CategoryEntity;
import com.bp.emazon.stock.infrastructure.persistence.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public String createCategory(CreateCategoryRequest body){

        if(body.getName().length()>50){
            return "Error: Se exceden los caracteres permitidos (50) para el campo name";
        }
        if(body.getDescription().length()>90){
            return "Error: Se exceden los caracteres permitidos (90) para el campo description";
        }

        CategoryEntity create = categoryRepository.findByName(body.getName());

        if (create != null) {
            return "La categoria ya se encuentra registrada";
        }

        CategoryEntity category = new CategoryEntity();
        category.setName(body.getName());
        category.setDescription(body.getDescription());

        categoryRepository.save(category);

        return "La categoria con id "+ category.getId()+" fue registrada";
    }

}

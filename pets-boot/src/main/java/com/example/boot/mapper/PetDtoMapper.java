package com.example.boot.mapper;

import com.example.domain.model.Category;
import com.example.domain.model.Pet;
import com.example.dto.CategoryDto;
import com.example.dto.PetDto;
import org.mapstruct.Mapper;

/**
 * Created by Juanma Perales on 29/1/23
 */
@Mapper
public interface PetDtoMapper {
    PetDto mapToPetDto(Pet pet);

    CategoryDto mapToCategoryDto(Category category);

}

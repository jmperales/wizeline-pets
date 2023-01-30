package com.example.adapters.mapper;

import com.example.adapters.model.PetJpa;
import com.example.domain.model.Pet;
import org.mapstruct.Mapper;

/**
 * Created by Juanma Perales on 29/1/23
 */
@Mapper
public interface PetJpaMapper {
    Pet mapToModel(PetJpa petJpa);
}

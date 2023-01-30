package com.example.adapters.service;

import com.example.adapters.model.PetApiDto;
import com.example.domain.model.Pet;

import java.util.Optional;

/**
 * Created by Juanma Perales on 29/1/23
 */
public interface PetClientService {
    Optional<PetApiDto> getPetById(Integer id);
}

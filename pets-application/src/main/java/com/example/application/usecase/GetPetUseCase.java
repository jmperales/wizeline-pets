package com.example.application.usecase;

import com.example.domain.model.Pet;

import java.util.Optional;

/**
 * Created by Juanma Perales on 29/1/23
 */
public interface GetPetUseCase {
    Optional<Pet> getPet(Integer id);
}

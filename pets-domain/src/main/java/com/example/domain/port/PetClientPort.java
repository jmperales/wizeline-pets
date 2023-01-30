package com.example.domain.port;

import com.example.domain.model.Pet;

import java.util.Optional;

/**
 * Created by Juanma Perales on 29/1/23
 */
public interface PetClientPort {
    Optional<Pet> getPet(Integer id);
}

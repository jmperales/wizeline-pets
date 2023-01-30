package com.example.adapters;

import com.example.adapters.mapper.PetJpaMapper;
import com.example.adapters.model.PetJpa;
import com.example.adapters.repository.PetJpaRepository;
import com.example.domain.model.Pet;
import com.example.domain.port.PetRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by Juanma Perales on 29/1/23
 */
@Component
@RequiredArgsConstructor
public class PetRepositoryAdapter implements PetRepositoryPort {

    private final PetJpaRepository petJpaRepository;

    private final PetJpaMapper mapper;
    @Override
    public Optional<Pet> findById(Integer id) {
        Optional<PetJpa> petJpa = petJpaRepository.findById(id);
        return petJpa.map(mapper::mapToModel);
    }
}

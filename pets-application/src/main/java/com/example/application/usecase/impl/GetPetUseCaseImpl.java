package com.example.application.usecase.impl;

import com.example.application.usecase.GetPetUseCase;
import com.example.domain.model.Pet;
import com.example.domain.port.PetClientPort;
import com.example.domain.port.PetRepositoryPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by Juanma Perales on 29/1/23
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class GetPetUseCaseImpl implements GetPetUseCase {

    private final PetRepositoryPort petRepositoryPort;

    private final PetClientPort petClientPort;
    @Override
    public Optional<Pet> getPet(Integer id) {
        if (petRepositoryPort.findById(id).isPresent()) {
            return petRepositoryPort.findById(id);
        } else {
            return petClientPort.getPet(id);
        }
    }
}

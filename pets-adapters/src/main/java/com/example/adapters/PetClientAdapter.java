package com.example.adapters;

import com.example.adapters.mapper.PetApiDtoMapper;
import com.example.adapters.model.PetApiDto;
import com.example.adapters.service.PetClientService;
import com.example.domain.model.Pet;
import com.example.domain.port.PetClientPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by Juanma Perales on 29/1/23
 */
@Service
@RequiredArgsConstructor
public class PetClientAdapter implements PetClientPort {

    private final PetClientService petClientService;

    private final PetApiDtoMapper mapper;

    @Override
    public Optional<Pet> getPet(Integer id) {
        Optional<PetApiDto> petById = petClientService.getPetById(id);
        return petById.map(mapper::mapToPetModel);
    }
}

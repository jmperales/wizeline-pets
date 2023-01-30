package com.example.boot.rest;

import com.example.application.usecase.GetPetUseCase;
import com.example.boot.mapper.PetDtoMapper;
import com.example.domain.model.Pet;
import com.example.dto.PetDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by Juanma Perales on 29/1/23
 */
@Slf4j
@RequestMapping("/api/v1/")
@RestController
@RequiredArgsConstructor
public class PetController {

    private final GetPetUseCase getPetUseCase;

    private final PetDtoMapper mapper;

    @GetMapping("pet/{petId}")
    public ResponseEntity<PetDto> findPet(@PathVariable("petId") Integer petId){
        Optional<Pet> pet = getPetUseCase.getPet(petId);
        return pet.map(value -> ResponseEntity.ok(mapper.mapToPetDto(value)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}

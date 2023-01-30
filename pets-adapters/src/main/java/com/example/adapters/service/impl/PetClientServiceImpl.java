package com.example.adapters.service.impl;

import com.example.adapters.mapper.PetApiDtoMapper;
import com.example.adapters.model.PetApiDto;
import com.example.adapters.service.PetClientService;
import com.example.domain.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

/**
 * Created by Juanma Perales on 29/1/23
 */
@ConfigurationProperties(prefix = "pet", ignoreUnknownFields = false)
@Service
public class PetClientServiceImpl implements PetClientService {

    public static final String PET_PATH = "/v2/pet/";
    private static final String PET_SERVICE_HOST = "https://petstore.swagger.io";
    private final RestTemplate restTemplate;

    @Autowired
    private PetApiDtoMapper mapper;

    public PetClientServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public Optional<PetApiDto> getPetById(Integer id) {
        final String url = PET_SERVICE_HOST.concat(PET_PATH).concat(id.toString());
        HttpHeaders headers = new HttpHeaders();
        headers.set("api_key", "special-key");

        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);

        ResponseEntity<PetApiDto> response = restTemplate.exchange(
                url, HttpMethod.GET, requestEntity, PetApiDto.class);

        return Optional.ofNullable(response.getBody());
    }
}

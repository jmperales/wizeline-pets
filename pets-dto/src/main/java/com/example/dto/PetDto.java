package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by Juanma Perales on 29/1/23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PetDto {
    @JsonProperty("id")
    Integer id;

    @JsonProperty("name")
    String name;

    @JsonProperty("category")
    private CategoryDto category;

    @JsonProperty("photoUrls")
    private List<String> photoUrls;

    @JsonProperty("status")
    private String status;
}

package com.example.adapters.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Juanma Perales on 29/1/23
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PetApiDto implements Serializable {
    static final long serialVersionUID = 7565992760221176325L;
    @JsonProperty("id")
    Integer id;

    @JsonProperty("category")
    CategoryDto category;

    @JsonProperty("name")
    String name;

    @JsonProperty("photoUrls")
    List<String> photoUrls;

    @JsonProperty("status")
    String status;

}

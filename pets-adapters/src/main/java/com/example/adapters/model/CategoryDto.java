package com.example.adapters.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Juanma Perales on 29/1/23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryDto implements Serializable {
    static final long serialVersionUID = 7565992760221176326L;
    @JsonProperty("id")
    Integer id;

    @JsonProperty("name")
    String name;
}

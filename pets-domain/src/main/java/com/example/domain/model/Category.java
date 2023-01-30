package com.example.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Juanma Perales on 29/1/23
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    private Integer id;

    private String name;
}

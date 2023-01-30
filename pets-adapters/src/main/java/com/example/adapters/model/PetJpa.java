package com.example.adapters.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Juanma Perales on 29/1/23
 */
@Getter
@Setter
@Entity
@Table
@NoArgsConstructor
public class PetJpa {
    @Id
    private Integer id;

    private String name;
}

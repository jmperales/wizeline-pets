package com.example.adapters.repository;

import com.example.adapters.model.PetJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Juanma Perales on 29/1/23
 */
@Repository
public interface PetJpaRepository extends JpaRepository<PetJpa, Integer> {
}

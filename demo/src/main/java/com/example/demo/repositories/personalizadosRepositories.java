package com.example.demo.repositories;

import com.example.demo.domain.personalizadosEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface personalizadosRepositories extends CrudRepository<personalizadosEntity, Long> {
    @Override
    Optional<personalizadosEntity> findById(Long id);
}
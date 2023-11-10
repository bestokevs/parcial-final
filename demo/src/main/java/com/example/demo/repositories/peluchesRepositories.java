package com.example.demo.repositories;

import com.example.demo.domain.peluchesEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface peluchesRepositories extends CrudRepository<peluchesEntity, Long> {

    @Override
    Optional<peluchesEntity> findById(Long id);
}

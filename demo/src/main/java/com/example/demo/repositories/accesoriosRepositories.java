package com.example.demo.repositories;

import com.example.demo.domain.accesoriosEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface accesoriosRepositories extends CrudRepository<accesoriosEntity, Long> {
    @Override
    Optional<accesoriosEntity> findById(Long id);
}

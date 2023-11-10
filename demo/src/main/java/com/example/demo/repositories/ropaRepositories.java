package com.example.demo.repositories;

import com.example.demo.domain.ropaEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ropaRepositories extends CrudRepository<ropaEntity, Long> {
    @Override
    Optional<ropaEntity> findById(Long id);
}

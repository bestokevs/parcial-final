package com.example.demo.repositories;

import com.example.demo.domain.figurasEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface figurasRepositories extends CrudRepository<figurasEntity, Long> {

    @Override
    Optional<figurasEntity> findById(Long id);
}
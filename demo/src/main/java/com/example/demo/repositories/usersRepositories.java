package com.example.demo.repositories;

import com.example.demo.domain.userEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;





public interface usersRepositories extends CrudRepository<userEntity,Long>{

    userEntity findByEmail(@Param(("email")) String email);
}


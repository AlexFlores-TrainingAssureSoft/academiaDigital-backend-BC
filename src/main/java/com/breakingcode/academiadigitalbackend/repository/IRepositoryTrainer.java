package com.breakingcode.academiadigitalbackend.repository;
import com.breakingcode.academiadigitalbackend.entity.Person;

import org.springframework.data.repository.CrudRepository;

public interface IRepositoryTrainer extends CrudRepository<Person,String> {
    
}

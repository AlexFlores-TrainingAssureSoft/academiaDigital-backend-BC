package com.breakingcode.academiadigitalbackend.repository;

import com.breakingcode.academiadigitalbackend.entity.Trainee;

import java.util.List;
import java.util.UUID;

public interface IRepository {

    List<Trainee> findAll();
    Trainee findById(UUID id);
    void save(Trainee trainee);
    void deleteById(UUID id);
}

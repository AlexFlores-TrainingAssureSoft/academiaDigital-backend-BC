package com.breakingcode.academiadigitalbackend.repository;

import com.breakingcode.academiadigitalbackend.entity.Trainee;

import java.util.List;
import java.util.UUID;

public interface IRepository {

    List<Trainee> findAll();
    Trainee findById(String uuid);
    String save(Trainee trainee);
    String deleteById(String uuid);
}

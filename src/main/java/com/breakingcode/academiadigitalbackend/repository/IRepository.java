package com.breakingcode.academiadigitalbackend.repository;

import com.breakingcode.academiadigitalbackend.entity.Trainee;

import java.util.List;
import java.util.UUID;

public interface IRepository {

    List<Trainee> getAll();
    Trainee getById(String uuid);
    String postTrainee(Trainee trainee);
    String deleteById(String uuid);
    String updateTrainee(Trainee trainee);
}

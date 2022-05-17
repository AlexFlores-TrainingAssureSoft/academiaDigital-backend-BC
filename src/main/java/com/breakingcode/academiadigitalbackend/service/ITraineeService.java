package com.breakingcode.academiadigitalbackend.service;

import com.breakingcode.academiadigitalbackend.entity.Trainee;

import java.util.List;

public interface ITraineeService {
    List<Trainee> getAllTrainees();
    Trainee getById(String uuid);
    String postTrainee(Trainee trainee);
    String deleteById(String uuid);
    String updateTrainee(Trainee trainee);
}

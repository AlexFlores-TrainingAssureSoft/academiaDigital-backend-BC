package com.breakingcode.academiadigitalbackend.service;

import com.breakingcode.academiadigitalbackend.entity.Trainee;

import java.util.List;

public interface IAcademiaDigitalService {
    List<Trainee> getAllTrainees();
    Trainee GetById(String uuid);
    String save(Trainee trainee);
    String deleteById(String uuid);

}

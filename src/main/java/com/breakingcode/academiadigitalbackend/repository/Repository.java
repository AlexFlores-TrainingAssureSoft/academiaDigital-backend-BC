package com.breakingcode.academiadigitalbackend.repository;

import com.breakingcode.academiadigitalbackend.entity.Modules;
import com.breakingcode.academiadigitalbackend.entity.Trainee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Repository implements IRepository{
    Trainee trainee;
    List <Modules> dev = new ArrayList<>();
     public List<Trainee> traineesList = new ArrayList<>(
            Arrays.asList(new Trainee(dev, "pepito","grupo5", "aplicado"))
    );

    @Override
    public List<Trainee> findAll() {
        return traineesList;
    }

    @Override
    public Trainee findById(UUID id) {
        int index = traineesList.indexOf(id);
        return traineesList.get(index);
    }

    @Override
    public void save(Trainee trainee) {
        traineesList.add(trainee);
    }


    @Override
    public void deleteById(UUID id) {
        int index = traineesList.indexOf(id);
        traineesList.remove(index);
    }
}

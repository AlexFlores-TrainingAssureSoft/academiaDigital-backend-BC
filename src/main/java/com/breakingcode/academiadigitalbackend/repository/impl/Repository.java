package com.breakingcode.academiadigitalbackend.repository.impl;

import com.breakingcode.academiadigitalbackend.entity.Modules;
import com.breakingcode.academiadigitalbackend.entity.Trainee;
import com.breakingcode.academiadigitalbackend.repository.IRepository;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@org.springframework.stereotype.Repository
public class Repository implements IRepository {
    List <Modules> dev = new ArrayList<>();
    public List<Trainee> traineesList = new ArrayList<>(Arrays.asList(
            new Trainee("Alex","Flores", "Alex@gmail.com","calle siempre viva","5123654","Carlos","4","buen chango"),
            new Trainee("Mauri","Gamarra", "Mauri@gmail.com","calle siempre viva2","54412654","Rodri","4","aplicado"),
            new Trainee("Melisa","Chiri", "Melisa@gmail.com","calle siempre viva3","5422654","Jorge","4","aplicada"),
            new Trainee("Jose","Medina", "Jose@gmail.com","calle siempre viva4","5411654","Jose","4","buen chango")));

    @Override
    public List<Trainee> getAll() {
        return traineesList;
    }

    @Override
    public Trainee getById(String uuid) {
        for (Trainee trainee:traineesList) {
            if(trainee.getGuid().equals(UUID.fromString(uuid))){
                return trainee;
            }
        }
        return null;
    }


    @Override
    public String postTrainee(Trainee trainee) {
        traineesList.add(trainee);
        return "OK";
    }


    @Override
    public String deleteById(String uuid) {
        for (Trainee trainee:traineesList) {
            if(trainee.getGuid().equals(UUID.fromString(uuid))){
                traineesList.remove(trainee);
                return "OK";
            }
        }
        return "This id doesn's exist";
    }

    @Override
    public String updateTrainee(Trainee traineeUpdate) {
        for(Trainee trainee:traineesList){
            if(trainee.getGuid().equals(traineeUpdate.getGuid())){
                traineesList.set(traineesList.indexOf(trainee),traineeUpdate);
                return "OK";
            }
        }
        return  "Doesn't find trainee";
    }
}

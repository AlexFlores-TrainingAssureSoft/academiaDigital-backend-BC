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
    public List<Trainee> traineesList = Arrays.asList(
            new Trainee(UUID.fromString("0280aafd-5cdd-4b76-b326-387fd525c16d"),"Alex","Flores", "Alex@gmail.com","calle siempre viva","5123654",dev,"Carlos","4","buen chango"),
            new Trainee(UUID.fromString("08d04158-bd32-42f7-a14c-9a73c69c758f"),"Mauri","Gamarra", "Mauri@gmail.com","calle siempre viva2","54412654",dev,"Rodri","4","aplicado"),
            new Trainee(UUID.fromString("bbfa90b5-45a1-422c-925f-0e5d80474f7d"),"Melisa","Chiri", "Melisa@gmail.com","calle siempre viva3","5422654",dev,"Jorge","4","aplicada"),
            new Trainee(UUID.fromString("3486946f-e0b3-41b9-9545-ad075308c2ba"),"Jose","Medina", "Jose@gmail.com","calle siempre viva4","5411654",dev,"Jose","4","buen chango"));

    @Override
    public List<Trainee> findAll() {
        return traineesList;
    }

    @Override
    public Trainee findById(String uuid) {
        int index = traineesList.indexOf(UUID.fromString(uuid));
        return traineesList.get(index);
    }


    @Override
    public String  save(Trainee trainee) {
        traineesList.add(trainee);
        return "OK";
    }


    @Override
    public String deleteById(String uuid) {
        return "OK";
    }
}

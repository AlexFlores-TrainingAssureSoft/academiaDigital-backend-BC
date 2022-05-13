package com.breakingcode.academiadigitalbackend.entity;

import java.util.List;
import java.util.UUID;

public class Trainee extends Person{
    private List<Modules> scoreModule;
    private String headTrainer;
    private String group;
    private String feedback;

    public Trainee(List<Modules> scoreModule, String headTrainer, String group, String feedback) {
        super(UUID.fromString("24b2286e-330b-4fac-8cc0-9eeee5cbabce"), "Pedro", "Picapiedra",
                "picapiedra@gmail.com", "piedra dura 12", "56254355");
        this.scoreModule = scoreModule;
        this.headTrainer = headTrainer;
        this.group = group;
        this.feedback = feedback;
    }
}

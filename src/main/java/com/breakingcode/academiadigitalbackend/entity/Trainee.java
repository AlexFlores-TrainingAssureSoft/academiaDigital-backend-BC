package com.breakingcode.academiadigitalbackend.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Trainee extends Person{
    private List<Modules> scoreModule;
    private String headTrainer;
    private String group;
    private String feedback;

    public Trainee(String firstName,String lastName, String email,String address, String mobile, String headTrainer, String group, String feedback) {
        super(firstName,lastName,email,address,mobile);
        this.scoreModule = new ArrayList<>();
        this.headTrainer = headTrainer;
        this.group = group;
        this.feedback = feedback;
    }

    public List<Modules> getScoreModule() {
        return scoreModule;
    }

    public void setScoreModule(List<Modules> scoreModule) {
        this.scoreModule = scoreModule;
    }

    public String getHeadTrainer() {
        return headTrainer;
    }

    public void setHeadTrainer(String headTrainer) {
        this.headTrainer = headTrainer;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}

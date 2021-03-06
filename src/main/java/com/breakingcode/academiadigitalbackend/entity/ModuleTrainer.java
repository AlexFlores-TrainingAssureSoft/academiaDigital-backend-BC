package com.breakingcode.academiadigitalbackend.entity;

import java.util.UUID;

public class ModuleTrainer extends Person{
    private String feedback;
    private String module;

    public ModuleTrainer( String firstName, String lastName, String email, String address, String mobile) {
        super(firstName, lastName, email, address, mobile);
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}

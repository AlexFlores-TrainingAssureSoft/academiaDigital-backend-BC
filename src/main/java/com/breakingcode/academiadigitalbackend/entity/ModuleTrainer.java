package com.breakingcode.academiadigitalbackend.entity;

import java.util.UUID;

public class ModuleTrainer extends Person{
    private String feedback;
    private String module;

    public ModuleTrainer(UUID guid, String firtsName, String lastName, String email, String address, String mobile) {
        super(guid, firtsName, lastName, email, address, mobile);
    }
}

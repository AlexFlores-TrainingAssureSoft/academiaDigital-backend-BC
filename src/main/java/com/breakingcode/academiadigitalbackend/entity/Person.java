package com.breakingcode.academiadigitalbackend.entity;

import java.util.UUID;

public class Person {
    private UUID guid;
    private String firtsName;
    private String lastName;
    private String email;
    private String address;
    private String mobile;

    public Person(UUID guid, String firtsName, String lastName, String email, String address, String mobile) {
        this.guid = guid;
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.mobile = mobile;
    }
}

package com.breakingcode.academiadigitalbackend.entity;

public class Modules {
    private String module;
    private String score;

    public Modules(String module,String score){
        this.module=module;
        this.score=score;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}

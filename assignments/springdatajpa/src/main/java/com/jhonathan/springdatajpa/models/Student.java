package com.jhonathan.springdatajpa.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private long id;

    private String name;

    private int  testScore;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTestScore() {
        return this.testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }
    
}

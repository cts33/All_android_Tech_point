package com.example.dagger2_test;


import javax.inject.Singleton;

@Singleton
public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

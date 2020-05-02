package com.daejun.app.entity;

public class Interests {
    private Long id;
    private String name;

    public Interests() {
    }

    public Interests(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

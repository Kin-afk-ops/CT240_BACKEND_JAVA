package com.example.demo.models;

import org.springframework.data.annotation.Id;

public class SampleModel {
    @Id
    private String id;
    private String name;

    public SampleModel() {}

    public SampleModel(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" + "id='" + id + '\'' + ", name='" + name + '\'' + "}";
    }
}

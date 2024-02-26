package com.example.test01;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("SomeNameBeans")
@RequestScoped
public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

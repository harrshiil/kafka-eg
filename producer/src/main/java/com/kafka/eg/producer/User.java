package com.kafka.eg.producer;

public class User {
    private String name;
    private String salary;

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getSalary() {
        return salary;
    }

    public User setSalary(String salary) {
        this.salary = salary;
        return this;
    }
}

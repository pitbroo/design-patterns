package com.example;

public class UserBuilder {
    private String username;
    private String firstName;
    private String lastName;
    private int age;

    public UserBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public User build() {
        return new User(username, firstName, lastName, age);
    }
}

// Copyright(C) 2023 Pedro Henrique Penna <pedrohenriquepenna@gmail.com>
// Licensed under the MIT license.

import java.security.InvalidParameterException;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidParameterException {
        checkName(name);
        checkAge(age);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        checkName(name);
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        checkAge(age);
        this.age = age;
    }

    private void checkName(String name) throws InvalidParameterException {
        if (name == null) {
            throw new InvalidParameterException("name cannot be null");
        } else if (name.length() < 1) {
            throw new InvalidParameterException("name cannot be empty");
        }
    }

    private void checkAge(int age) throws InvalidParameterException {
        if (age < 0) {
            throw new InvalidParameterException("age cannot be negative");
        }
    }
}

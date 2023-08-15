// Copyright(C) 2023 Pedro Henrique Penna <pedrohenriquepenna@gmail.com>
// Licensed under the MIT license.

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("Hello, I'm " + this.name + " and I'm " + this.age + " years old.");
    }
}

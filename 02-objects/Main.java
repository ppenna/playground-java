// Copyright(C) 2023 Pedro Henrique Penna <pedrohenriquepenna@gmail.com>
// Licensed under the MIT license.

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Pedro", 31);
        System.out.println("Hello, I'm " + p.name + " and I'm " + p.age + " years old.");
    }
}

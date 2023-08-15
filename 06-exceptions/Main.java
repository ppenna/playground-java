// Copyright(C) 2023 Pedro Henrique Penna <pedrohenriquepenna@gmail.com>
// Licensed under the MIT license.

import java.security.InvalidParameterException;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Pedro", 31);

        System.out.println("Hello, I'm " + p.getName() + " and I'm " + p.getAge() + " years old.");

        try {
            p.setAge(-1);

            System.out.println("This never gets executed");
        } catch (InvalidParameterException e) {
            System.out.println("Invalid Parameter Exception: " + e.getMessage());
        } finally {
            System.out.println("This always get executed");
        }

        System.out.println("Hello, I'm " + p.getName() + " and I'm still " + p.getAge() + " years old.");
    }
}

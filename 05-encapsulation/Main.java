// Copyright(C) 2023 Pedro Henrique Penna <pedrohenriquepenna@gmail.com>
// Licensed under the MIT license.

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Pedro", 31);

        System.out.println("Hello, I'm " + p.getName() + " and I'm " + p.getAge() + " years old.");
        p.setAge(32);
        System.out.println("Hello, I'm " + p.getName() + " and I'm " + p.getAge() + " years old.");
    }
}

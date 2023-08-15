// Copyright(C) 2023 Pedro Henrique Penna <pedrohenriquepenna@gmail.com>
// Licensed under the MIT license.

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Pedro", 31);

        System.out.println("Hello, I'm " + student.getName() + " and my ID is " + student.getId());
    }
}

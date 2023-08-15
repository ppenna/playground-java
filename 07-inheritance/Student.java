// Copyright(C) 2023 Pedro Henrique Penna <pedrohenriquepenna@gmail.com>
// Licensed under the MIT license.

import java.security.InvalidParameterException;

public class Student extends Person {
    private int id;

    public Student(int id, String name, int age) throws InvalidParameterException {
        super(name, age);

        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}

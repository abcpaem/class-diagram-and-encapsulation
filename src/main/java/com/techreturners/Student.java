package com.techreturners;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private Character grade;
    private Integer group;
    private final String stringSecretName = "MySecretNickName";
    private final List<Character> grades = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F');
    private final List<Integer> groups = Arrays.asList(1, 2, 3, 4, 5);

    public Student(String name, Character grade, Integer group) {
        this.name = name;
        this.grade = grade;
        this.group = group;

        if (!grades.contains(grade)) {
            throw new InvalidParameterException("Grade " + grade + "is not valid");
        }

        if (!groups.contains(group)) {
            throw new InvalidParameterException("Group " + group + "is not valid");
        }
    }

    public String getName() {
        return name;
    }

    public Character getGrade() {
        return grade;
    }

    public void downgrade() {
        if (grades.indexOf(grade) < grades.size() - 1)
            grade = grades.get(grades.indexOf(grade) + 1);
    }

    public void upgrade() {
        if (grades.indexOf(grade) > 0)
            grade = grades.get(grades.indexOf(grade) - 1);
    }
}
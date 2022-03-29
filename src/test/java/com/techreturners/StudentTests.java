package com.techreturners;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.security.InvalidParameterException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

public class StudentTests {
    @ParameterizedTest
    @CsvSource(delimiterString = ",", textBlock = """
            Peter, H , 1
            John,  C , 7            
                        """)
    void checkInvalidStudentCreation(String name, Character grade, Integer group) {
        assertThrows(InvalidParameterException.class, () -> new Student(name, grade, group));
    }

    @ParameterizedTest
    @CsvSource({"James,C,2"})
    void checkValidStudentCreation(String name, Character grade, Integer group) {
        assertDoesNotThrow(() -> new Student(name, grade, group));
    }

    @ParameterizedTest
    @MethodSource("studentsProvider")
    void checkGetStudentName(String name, Character grade, Integer group) {
        Student student = new Student(name, grade, group);

        assertEquals(name, student.getName());
    }

    @ParameterizedTest
    @MethodSource("studentsProvider")
    void checkGetStudentGrade(String name, Character grade, Integer group) {
        Student student = new Student(name, grade, group);

        assertEquals(grade, student.getGrade());
    }

    @ParameterizedTest
    @CsvSource({"James,C,2,B"})
    void checkStudentUpgrade(String name, Character grade, Integer group, Character expectedGrade) {
        Student student = new Student(name, grade, group);

        student.upgrade();

        assertEquals(expectedGrade, student.getGrade());
    }

    @ParameterizedTest
    @CsvSource({"Bill,C,2,D"})
    void checkStudentDowngrade(String name, Character grade, Integer group, Character expectedGrade) {
        Student student = new Student(name, grade, group);

        student.downgrade();

        assertEquals(expectedGrade, student.getGrade());
    }

    static Stream<Arguments> studentsProvider() {
        return Stream.of(
                arguments("Kim", "A", 2),
                arguments("Pat", "B", 4)
        );
    }
}
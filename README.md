# Class diagram and encapsulation
Set of activities for class diagram and encapsulation practice.

## Exercise 1: Class Diagrams

Read and study the following business requirements and acceptance criteria.

### Business Requirement:
We’ve just had a request from a school and they would like to track student grades for the Mathematics class. It’s the end of the school term and  the teacher would like to input the student grades into a system. They would like your help to design and code up a Java class to represent a  student.
You can find the business acceptance criteria below:

### Business Acceptance Criteria:
- Your program must have a Student Java class
  - A Student must have a name
  - A Student must have a single grade
    - The value for grade must be one of the following: A, B, C, D, E, F
  - A Student must have a single group
    - The value for group must be one of the following: 1, 2, 3, 4, 5
  - A Student has a secretNickName and is set to “MySecretNickName”
- The school should be able to initialise the Student Java Class with an initial value for name, grade and group. The school should be able to get the Student’s grade securely
- The school should be able to get the Student’s name securely
- The school should NOT be able to get the Student’s secretNickName
- The school should be able to call methods to upgrade and downgrade the Student’s grade.
  - For example, if the Student has a current grade of “B”, an upgrade will result in the grade being set to “A”.
  - If the Student has a current grade of “C”, a downgrade will result in the grade being set to “D”. 

**Activity 1.1** Using your understanding of access modifiers, getters and setters, draw a well-encapsulated class diagram to satisfy the business  acceptance criteria.

### Solution:

![Student Class Diagram](docs/StudentClassDiagram.PNG)

## Exercise 2: Translate the Class Diagram into Code

**Activity 2.1** Using your understanding of access modifiers, getters and setters, translate your class diagram from Exercise 1 into working Java  code.

### Solution:

Click [here](src/main/java/com/techreturners/Student.java) to see the Student class.

#### How to run the app
1) cd to the project root folder in the command line
2) ``mvn compile``
3) ``mvn exec:java -Dexec.mainClass=com.techreturners.Main``

#### Main Output:
```
Name: Peter
Grade: C
Upgrading student 2 grades...
Upgraded grade: A
Downgrading student 1 grade...
Downgraded grade: B
```

#### How to run the tests
1) cd to the project root folder in the command line
2) ``mvn test``

#### Tests results:
```
Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.127 s - in com.techreturners.StudentTests
```
---
## Technology
This project was built using:
- Java version 17.0.2
- JUnit 5.8.2 for unit testing
- Apache Maven 3.8.5 as project manager
- Community Edition for the IntelliJ 2021.3.2 development environment.
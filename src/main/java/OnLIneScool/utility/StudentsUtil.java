package main.java.OnLIneScool.utility;

import main.java.OnLIneScool.entyty.Students;
public class StudentsUtil {
    Students students;

    public StudentsUtil(Students students) {
        this.students = students;
    }


    void sayNameStudents() {
        System.out.println(students.getName() + students.getSurname());
    }
    void seyCountStudents () {
        System.out.println("Kilkist' Studentiv - " +  Students.getCountStudents());
    }
}

package OnLIneScool.utility;

import OnLIneScool.entyty.Students;
public class StudentsUtil {
    Students students;
    void sayNameStudents() {
        System.out.println(students.getName() + students.getSurname());
    }
    void seyCountStudents () {
        System.out.println("Kilkist' Studentiv - " +  Students.getCountStudents());
    }
}

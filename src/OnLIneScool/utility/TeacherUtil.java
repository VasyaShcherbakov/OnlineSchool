package OnLIneScool.utility;

import OnLIneScool.entyty.Teacher;
public class TeacherUtil {
    Teacher teacher;
    void sayNameTeacher() {
        System.out.println(teacher.getName() + teacher.getSurname());
    }
    void countTeacher() {
        System.out.println("Kilkist' Vhiteliv - " + Teacher.getCountTeacher());
    }

}

package OnLIneScool.utility;

import OnLIneScool.entyty.Lectures;
public class LecturesUtil {

    Lectures lectures;

    void sayNameLectures() {
        System.out.println(lectures.getName() + lectures.getSurname());
    }
    void setCountLectures() {
        System.out.println("Kilkist' Lektoriv - " + Lectures.getCountLectures());
    }


}

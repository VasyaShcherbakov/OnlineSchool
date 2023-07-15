package main.java.OnLIneScool.utility;

import main.java.OnLIneScool.entyty.Lectures;
public class LecturesUtil {

    Lectures lectures;

    public LecturesUtil(Lectures lectures) {
        this.lectures = lectures;
    }

    void printStudent () {
        System.out.println(lectures);
    }

    public void sayNameLectures() {
        System.out.println(lectures.getName() + lectures.getSurname());
    }


   public void setCountLectures() {
        System.out.println("Kilkist' Lekciy  - " + Lectures.getCountLectures());
    }


}

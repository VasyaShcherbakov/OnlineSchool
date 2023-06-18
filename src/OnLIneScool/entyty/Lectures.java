package OnLIneScool.entyty;

import OnLIneScool.utility.LecturesUtil;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Lectures {
    private Date lectureDate;
    HomeWork [] homeWork = new HomeWork[3];

    public Lectures(HomeWork[] homeWork) {
        this.homeWork = homeWork;
    }

    HomeWork homeWork1 = new HomeWork(1,2,"Hard");



    private int personId;

    private int creationDate;



    private Integer id;

    int date;
    public String idKurse;
    private byte curs;
    static int countLectures;
    private String name;
    private String surname;
    private int academicPerformance;

    private String description ;

    public Lectures(int i, int i1) {
    }


    @Override
    public String toString() {
        return "Lectures{" +
                "id=" + id +
                ", idKurse='" + idKurse + '\'' +
                ", curs=" + curs +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", academicPerformance=" + academicPerformance +
                '}';
    }

    public Lectures(int id, byte curs, String name, String surname, int academicPerformance) {
        this.id = id;
        this.curs = curs;
        this.name = name;
        this.surname = surname;
        this.academicPerformance = academicPerformance;
        countLectures++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdKurse() {
        return idKurse;
    }

    public void setIdKurse(String idKurse) {
        this.idKurse = idKurse;
    }

    public byte getCurs() {
        return curs;
    }

    public void setCurs(byte curs) {
        this.curs = curs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(int academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    public static int getCountLectures() {
        return countLectures;
    }

    public Lectures(String idKurse) {
        this.idKurse = idKurse;
    }

    public Lectures() {

        }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Lectures(Date lectureDate, int creationDate) {
        this.lectureDate = lectureDate;
        this.creationDate = creationDate;
    }
}

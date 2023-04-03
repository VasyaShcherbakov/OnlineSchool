package OnLIneScool.entyty;

import OnLIneScool.utility.LecturesUtil;

public class Lectures {
    public int id;

    public String idKurse;
    public byte curs;
    static int countLectures;
    public String name;
    public String surname;
    public int academicPerformance;

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
}

package OnLIneScool.entyty;

public class Lectures {
    private int id;

    public String idKurse;
    private byte curs;
    static int countLectures;
    private String name;
    private String surname;
    private int academicPerformance;


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

    void sayNameLectures() {
        System.out.println(name + surname);
    }

    void setCountLectures() {
        System.out.println("Kilkist' Lektoriv - " + countLectures);
    }


}

package OnLIneScool.entyty;

class Lectures {
    private int id;
    byte curs;
    static int countLectures;
    String name;
    String surname;
    int academicPerformance;

    public Lectures(int id, byte curs, String name, String surname, int academicPerformance) {
        this.id = id;
        this.curs = curs;
        this.name = name;
        this.surname = surname;
        this.academicPerformance = academicPerformance;
        countLectures++;
    }



    void sayNameLectures() {
        System.out.println(name + surname);
    }
    void setCountLectures() {
        System.out.println("Kilkist' Lektoriv - " + countLectures);
    }


}

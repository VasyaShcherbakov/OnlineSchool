package OnLIneScool.entyty;

public class Teacher {
    private int id;
    static int countTeacher;
    int curs;
    String name;
    String surname;
    int academicPerformance;

    public Teacher(int id, int curs, String name, String surname, int academicPerformance) {
        this.id = id;
        this.curs = curs;
        this.name = name;
        this.surname = surname;
        this.academicPerformance = academicPerformance;
        countTeacher ++;
    }

    void sayNameTeacher() {
        System.out.println(name + surname);
    }

    void countTeacher() {
        System.out.println("Kilkist' Vhiteliv - " + countTeacher);
    }
}

package course3.entyty;

public class Teacher {
    public Teacher(int id, String name, String surname, int academicPerformance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.academicPerformance = academicPerformance;
    }

    private int id ;
    static int count;
    String name ;
    String surname;
    int academicPerformance ;
    Teacher () {
        count++;
    }
    void count () {
        System.out.println("Kilkist' Vhiteliv 3 Kurs - "+count);
    }


}

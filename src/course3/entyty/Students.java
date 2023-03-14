package course3.entyty;

public class Students {
    public Students(int id, String name, String surname, int academicPerformance) {
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
    Students () {
        count++;
    }
    void count () {
        System.out.println("Kilkist' Studentiv 1 Kurs - "+count);
    }


}

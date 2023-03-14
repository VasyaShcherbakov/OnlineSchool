package course3.entyty;

public class Lectures {
    public Lectures(int id, String name, String surname, int academicPerformance) {
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

    Lectures () {
        count++;
    }
    void count () {
        System.out.println("Kilkist' Lektoriv 3 Kurs - "+count);
    }


}

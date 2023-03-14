package course1.entyty;

    public class Teacher {
    private int id;
    int count;

    public Teacher(int id, String name, String surname, int academicPerformance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.academicPerformance = academicPerformance;
    }

    public Teacher() {
        count++;
    }

    String name;
    String surname;
    int academicPerformance;

    void sayNameTeacher() {
        System.out.println(this.name + this.surname);
    }

    void count () {
        System.out.println("Kilkist' Vhiteliv 1 Kurs - "+count);
    }
}

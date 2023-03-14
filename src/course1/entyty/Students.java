package course1.entyty;

    class Students {
    private int id;
    int count;

    public Students(int id, String name, String surname, int academicPerformance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.academicPerformance = academicPerformance;
    }

    public Students() {
        count++;
    }

    String name;
    String surname;
    int academicPerformance;
    void count () {
        System.out.println("Kilkist' Studentiv 1 Kurs - "+count);
    }
}

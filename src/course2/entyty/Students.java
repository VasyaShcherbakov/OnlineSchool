package course2.entyty;

    class Students {
    private int id ;
    static int count;
    String name ;
    public Students() {
        count++;
    }

    public Students(int id, String name, String surname, int academicPerformance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.academicPerformance = academicPerformance;
    }

    String surname;
    int academicPerformance ;

    void count () {
        System.out.println("Kilkist' Studentiv 2 Kurs - "+count);
    }

}

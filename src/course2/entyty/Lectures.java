package course2.entyty;

    class Lectures {
    public Lectures(int id, String name, String surname, int academicPerformance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.academicPerformance = academicPerformance;
    }
    public Lectures () {
        count++;
    }
    private int id ;
    static int count;
    String name ;
    String surname;
    int academicPerformance ;
    void count () {
        System.out.println("Kilkist' Lektoriv 2 Kurs - "+count);
    }


}

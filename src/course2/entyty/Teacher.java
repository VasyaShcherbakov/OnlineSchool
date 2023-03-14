package course2.entyty;

    public   class Teacher {
    public Teacher(int id, String name, String surname, int academicPerformance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.academicPerformance = academicPerformance;
    }
    public Teacher() {
        count++;
    }
    private int id ;
    static int count;

    String name ;
    String surname;
    int academicPerformance ;
        void count () {
            System.out.println("Kilkist' Teacher 2 Kurs - "+count);
        }
}

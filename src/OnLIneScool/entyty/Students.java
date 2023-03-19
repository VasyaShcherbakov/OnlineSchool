package OnLIneScool.entyty;

class Students {
    private int id;

    static   int countStudents;
    int curs;
    String name;
    String surname;
    int academicPerformance;

    public Students(int id, int curs, String name, String surname, int academicPerformance) {
        this.id = id;
        this.curs = curs;
        this.name = name;
        this.surname = surname;
        this.academicPerformance = academicPerformance;
        countStudents ++;
    }




    void sayNameStudents() {
        System.out.println(name + surname);
    }
    void  seyCountStudents () {
        System.out.println("Kilkist' Studentiv - " +  countStudents);
    }
}

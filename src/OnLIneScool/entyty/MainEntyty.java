package OnLIneScool.entyty;

class MainEntyty {
    public static void main(String[] args) {
        Teacher teacher0  = new Teacher(1,1,"Dmitriy","Yukhimovich",90);

        Teacher teacher1 = new Teacher(2,2, "Shastyslav", "Vitanovich", 90);

        Teacher teacher2 = new Teacher(3,3,"Charl'z","Maksimovich",90);

        Students students0 = new Students(4,1,"Vlada", "Vadimivna", 80);

        Students students1 = new Students(5,2, "Zvonimira", "Semenivna", 80);

        Students students2 = new Students(6,3, "Odarka", "Timurivna", 95);

        Lectures lectures = new Lectures(7, (byte) 1, "Nikodim", "Pilipovith", 60);

        Lectures lectures1 = new Lectures(8,(byte) 2, "Tverdigorst", "Yaromirovith", 85);

        Lectures lectures2 = new Lectures(9, (byte) 3, "Juliy", "Arsenovith", 85);

        int generalPreformence;
        int totalPerformance;


        teacher0.countTeacher();
        teacher0.sayNameTeacher();
        lectures.sayNameLectures();
        students0.sayNameStudents();
        lectures.setCountLectures();
        System.out.println("Kilkist' Vhiteliv 1 Kurs - "+Teacher.countTeacher);
        students0.sayNameStudents();
    }


}


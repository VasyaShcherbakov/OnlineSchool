package OnLIneScool.entyty;

import OnLIneScool.utility.LecturesUtil;

class MainEntyty {
    public static void main(String[] args) {
        Teacher teacher0  = new Teacher(1,1,"Dmitriy","Yukhimovich",90);

        Lectures lectures = new Lectures(7, (byte) 1, "Nikodim", "Pilipovith", 60);
        lectures.idKurse = "1";
        Teacher teacher1 = new Teacher(2,2, "Shastyslav", "Vitanovich", 90);

        Lectures lectures1 = new Lectures(8,(byte) 2, "Tverdigorst", "Yaromirovith", 85);
        lectures1.idKurse = "1";

        Teacher teacher2 = new Teacher(3,3,"Charl'z","Maksimovich",90);

        Lectures lectures2 = new Lectures(9, (byte) 3, "Juliy", "Arsenovith", 85);
        lectures2.idKurse = "1";

        // Створюємо 6 лекцій.

        Lectures lectures3 = new Lectures(10,(byte) 3,"Prokhor","Evgenievich",90);
        lectures3.idKurse = "1";
        Lectures lectures4 = new Lectures(11,(byte) 4,"Zhiger","Yukhimovich",85);
        lectures4.idKurse = "2";
        Lectures lectures5 = new Lectures(12,(byte) 5,"Evsey","Alexandrovich",75);
        lectures5.idKurse = "3";
        Lectures lectures6 = new Lectures(13,(byte) 5,"Felix","Petrovich",85);
        lectures6.idKurse = "4";
        Lectures lectures7 = new Lectures(14,(byte) 1,"Charles","Vadimovich",90);
        lectures7.idKurse = "5";
        Lectures lectures8 = new Lectures(15,(byte) 1,"Orlando","Andreevich",95);
        lectures8.idKurse ="1";
        // Виводим на екран ID курсу 6 лекції
        System.out.println("ID Kursu 6 lekcii  =  " +lectures6.idKurse);

        LecturesUtil lecturesUtil = new LecturesUtil(lectures);
        lecturesUtil.sayNameLectures();
        lecturesUtil.setCountLectures();






        Students students0 = new Students(4,1,"Vlada", "Vadimivna", 80);

        Students students1 = new Students(5,2, "Zvonimira", "Semenivna", 80);

        Students students2 = new Students(6,3, "Odarka", "Timurivna", 95);









        LecturesUtil lecturesUtil1 = new LecturesUtil(lectures);
        lecturesUtil.sayNameLectures();
        lecturesUtil.sayNameLectures();

        LecturesUtil lecturesUtil2 = new LecturesUtil(lectures1);

        lecturesUtil.setCountLectures();


        int generalPreformence;

        int totalPerformance;

        teacher0.getSurname();





        System.out.println("Kilkist' Vhiteliv 1 Kurs - "+Teacher.countTeacher);

    }


}


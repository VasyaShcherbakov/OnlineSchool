package OnLIneScool.entyty;

import OnLIneScool.utility.LecturesUtil;

import java.util.Scanner;

class MainEntyty {
    public static void main(String[] args) {
        Teacher teacher0 = new Teacher(1, 1, "Dmitriy", "Yukhimovich", 90);

        Lectures lectures = new Lectures(7, (byte) 1, "Nikodim", "Pilipovith", 60);
        lectures.idKurse = "1";
        Teacher teacher1 = new Teacher(2, 2, "Shastyslav", "Vitanovich", 90);

        Lectures lectures1 = new Lectures(8, (byte) 2, "Tverdigorst", "Yaromirovith", 85);
        lectures1.idKurse = "1";

        Teacher teacher2 = new Teacher(3, 3, "Charl'z", "Maksimovich", 90);

        Lectures lectures2 = new Lectures(9, (byte) 3, "Juliy", "Arsenovith", 85);
        lectures2.idKurse = "1";

        // Створюємо 6 лекцій.

        Lectures lectures3 = new Lectures(10, (byte) 2, "Prokhor", "Evgenievich", 90);
        lectures3.idKurse = "1";
        Lectures lectures4 = new Lectures(11, (byte) 4, "Zhiger", "Yukhimovich", 85);
        lectures4.idKurse = "2";
        Lectures lectures5 = new Lectures(12, (byte) 5, "Evsey", "Alexandrovich", 75);
        lectures5.idKurse = "3";
        Lectures lectures6 = new Lectures(13, (byte) 5, "Felix", "Petrovich", 85);
        lectures6.idKurse = "4";
        Lectures lectures7 = new Lectures(14, (byte) 1, "Charles", "Vadimovich", 90);
        lectures7.idKurse = "5";
        Lectures lectures8 = new Lectures(15, (byte) 1, "Orlando", "Andreevich", 95);
        lectures8.idKurse = "1";
        Students students0 = new Students(4, 1, "Vlada", "Vadimivna", 80);

        Students students1 = new Students(5, 2, "Zvonimira", "Semenivna", 80);

        Students students2 = new Students(6, 3, "Odarka", "Timurivna", 95);


        // Виводим на екран ID курсу 6 лекції

        /* System.out.println("ID Kursu 6 lekcii  =  " +lectures6.idKurse);*/

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        int genre = 0;

        do {
            System.out.println("Select genre of course category :");
            System.out.println("1. Lectures");
            System.out.println("2. Students");
            System.out.println("3. Teaher");
            System.out.println("4. Create 8 Lectures");
            genre = scanner.nextInt();
        }
        while (genre < 1 || genre > 4);


        switch (genre) {
            case 1:

                int selCurs = 0;

                do {
                    System.out.println("Kilkist' Lekciy = ");
                    System.out.println(Lectures.getCountLectures());

                    System.out.println("Vuberit' Kurs - Select Curs 1 / 2 / 3 /4/");

                    selCurs = scanner.nextInt();
                }
                while (selCurs < 1 || selCurs > 4);

                switch (selCurs) {
                    case 1:

                        System.out.println(lectures7);
                        System.out.println(lectures8);
                        break;
                    case 2:

                        System.out.println(lectures3);
                        break;
                    case 3:

                        System.out.println(lectures2);
                        break;
                    case 4:
                        System.out.println(lectures4);
                        break;
                }


            case 2:

                int selCurs1 = 0;
                do {


                    System.out.println("Kilkist' Studentiv = ");
                    System.out.println(Students.getCountStudents());
                    System.out.println("Vuberit' Kurs - Select Curs 1 / 2 / 3 ");
                }
                while (selCurs1 < 1 || selCurs1 > 4);
                selCurs1 = scanner2.nextInt();

                switch (selCurs1) {

                    case 1:
                        System.out.println(students0);
                        break;
                    case 2:
                        System.out.println(students1);
                        break;
                    case 3:
                        System.out.println(students2);
                        break;
                }
                break;

            case 3:

                int selCurs3 = 0;

                do {


                    System.out.println(Teacher.countTeacher);
                    System.out.println("Kilkist' Vchiteliv = ");

                    System.out.println("Vuberit' Kurs - Select Curs 1 / 2 / 3 ");

                    selCurs3 = scanner3.nextInt();
                }
                while (selCurs3 < 1 || selCurs3 > 4);
                switch (selCurs3) {

                    case 1:
                        System.out.println(teacher0);
                        break;
                    case 2:
                        System.out.println(teacher1);
                        break;
                    case 3:
                        System.out.println(teacher2);
                }


                break;
            case 4:




            for ( int i = 0 ;i < 8; i++ );
            {
                int r = 1;
              Lectures lectures10 = new Lectures(10, (byte) 3,"Name1","Surname2",80);
               lectures10.setId(10);
                lectures10.idKurse.equals("1");
                lectures10.name = ("Name"+r);
                lectures10.surname = ("Name"+ r);

                lectures10.academicPerformance = (80+r);
                r++;
            }









                break;

        }





    }

}



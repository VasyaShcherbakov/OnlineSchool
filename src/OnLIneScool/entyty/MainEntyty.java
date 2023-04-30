package OnLIneScool.entyty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.IllegalArgumentException.*;

class MainEntyty {






    public static void main(String[] args) {

        List<Students> students = new ArrayList<>();
    students.add(new Students(1));
    students.add(new Students(2))
    students.add(new Students(3));
    Simplerator<Students>studentsSimplerator=new Simplerator<>(Students);

    }



/*

        System.out.println("Enter genre of course category :");
        System.out.println("Lectures");
        System.out.println("Students");
        System.out.println("Teaher");
        Scanner scanner = new Scanner(System.in);
        String role;
        role = scanner.nextLine();
        try {
            if (role.equals("Lectures")) {
                System.out.println("Vi Vibrali Lectures");
            } else if (role.equals("Students")) {
                System.out.println("Vi Vibrali Students");
            } else if (role.equals("Teaher")) {
                System.out.println("Vi Vibrali Teaher");
            } else {
                throw new IllegalArgumentException("Vibrana nevidoma Kategorija");
            }

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());*/
        }












      /*  Person person = new Students(160,"Male",1,2,"Yukhimovych","Charles ",80);
        Person person1 = new Teacher(180,"Female",2,2, " Matvey ","Anatolyevich",90);
        HomeWork homeWork = new HomeWork(1,2,"Hard");

*/





/*
    }
*/












 /*       int genre = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select genre of Person Role :");
            System.out.println("1. STUDENT");
            System.out.println("2.  TEACHER");
            genre = scanner.nextInt();

        }
        while (genre < 1 || genre > 2);
        PersonRole personRole = PersonRole.STUDENT;
        PersonRole personRole2 = PersonRole.TEACHER;



        switch (genre) {
            case 1 -> {
                StringBuffer stringBuffer = new StringBuffer("STUDENT");
                System.out.println(stringBuffer.reverse());
                System.out.println(stringBuffer.length());
                System.out.println(stringBuffer.capacity());
                System.out.println("Vvvedit' imja i Familiju");
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
                System.out.println("Kil'kist' vvedenyh sivoliv");
                System.out.println(name.length());
            }


            case 2 -> {
                System.out.println("Vvvedit' imja i Familiju");
                StringBuffer stringBuffer2 = new StringBuffer("TEACER");
                System.out.println(stringBuffer2.reverse());
                System.out.println(stringBuffer2.length());
                System.out.println(stringBuffer2.capacity());
                System.out.println("Vvvedit' imja i Familiju");
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
                System.out.println("Kil'kist' vvedenyh sivoliv");
                System.out.println(name.length());


            }*/


        /*   }*/


        //  PersonRole personRole1 = PersonRole.TEACHER;











       /* Scanner scanner = new Scanner(System.in);

        int genre = 0;

        do {
            System.out.println("Select genre of Person Role :");
            System.out.println("1. STUDENT");
            System.out.println("2.  TEACHER");
            genre = scanner.nextInt();

        }
        while (genre < 1 || genre > 4);
        PersonRole personRole = PersonRole.STUDENT;
        PersonRole personRole2 = PersonRole.TEACHER;
        System.out.println(personRole.getTranslation());
        System.out.println(PersonRole.valueOf("STUDENT"));

        switch (genre) {
            case 1 -> System.out.println(personRole);
        //    System.out.println("STUDENT");

            case 2 -> System.out.println(personRole2);
         //   System.out.println("TEACHER");



        }


*/


/*
        StudentsRepository.createStudentsArray(3);
        TeacherRepository.createTeacherArray(3);

        final Students [] students = StudentsRepository.students;
        final Teacher[] teachers = TeacherRepository.teachers;
        students[0]= new Students(180,"man",1,1,"Milan","Romanovich",90);
        students[1]=new Students(170,"man",2,2,"Trofim","Alekseevich",95);
        students[2]=new Students(160,"man",3,3,"Zhdan","Vitalievich",95);
        teachers[0]=new Teacher(185,"man",1,1,"Stefan","Lvovich",80);
        teachers[1]=new Teacher(190,"man",2,2,"Pyotr","Fyodorovich",80);
        teachers[2]=new Teacher(190,"man",3,3,"Charles","Borisovich",95);

        final Students[] studentsCopy = Arrays.copyOf(students, 100);


       for (int e = 0 ; e < studentsCopy.length; e++ ) {
       Students e1 = studentsCopy [e] ;
       System.out.println( e1);
       }
        System.out.println(StudentsRepository.students[0]);;
        for (Students students1 : students)
        {
            System.out.println(students1);
        }



        Teacher teacher0 = new Teacher(190,"man",1, 1, "Dmitriy", "Yukhimovich", 90);

        Lectures lectures = new Lectures(7, (byte) 1, "Nikodim", "Pilipovith", 60);

        Teacher teacher1 = new Teacher(190,"man",2, 2, "Shastyslav", "Vitanovich", 90);

        Lectures lectures1 = new Lectures(8, (byte) 2, "Tverdigorst", "Yaromirovith", 85);


        Teacher teacher2 = new Teacher(180,"man",3, 3, "Charl'z", "Maksimovich", 90);

        Lectures lectures2 = new Lectures(9, (byte) 3, "Juliy", "Arsenovith", 85);


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
        Students students0 = new Students(180,"female",4, 1, "Vlada", "Vadimivna", 80);

        Students students1 = new Students(170,"female",5, 2, "Zvonimira", "Semenivna", 80);

        Students students2 = new Students(195,"female",6, 3, "Odarka", "Timurivna", 95);


        // Виводим на екран ID курсу 6 лекції

        */
        /* System.out.println("ID Kursu 6 lekcii  =  " +lectures6.idKurse);*//*


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




           */
/* for ( int i = 0 ;i < 8; i++ );
            {
              Lectures lectures10 = new Lectures();
               lectures10.setId(10);
                lectures10.idKurse.equals("1"+ 1);
                lectures10.name.equals("Name"+i);
                lectures10.surname.equals ("Name"+ i);

                lectures10.setAcademicPerformance((0x50 + i));
                i++;
            }*//*










                break;

        }



*/


/*
    }
}*/

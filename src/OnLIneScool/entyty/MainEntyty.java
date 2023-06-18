package OnLIneScool.entyty;

import java.util.ArrayList;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
class MainEntyty {
    public static void main(String[] args) {
        Students student1 = new Students(123, 95);
        Students students2 = new Students(2,94);


        Optional<Integer> studentID = student1.getID(); // Optional[123]
        Optional<Integer> studentResponse = student1.getDatabaseResponse();
       /* Students student2 = new Students(456,null, 7);*/
        Optional<Integer> studentID2 = student2.getID(); // Optional[456]
        Optional<Integer> studentResponse2 = student2.getDatabaseResponse();
        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(1,"Yarovoy Erik Vasilievich");
        teachers.add(2,"Ignatiev Sherlock Leonidovich");
        teachers.add(3,"Tsushko Makar Grigorievich");
        teachers.add(4,"Petrov Leon Vitalievich");
        teachers.add(5,"Maslovsky Eduard Lvovich");
        teachers.add(6,"Ovcharenko Dominik Andreevich");
        teachers.add(7,"Kotsiubinsky Joseph Vladimirovich");
        teachers.add(8,"Yakovenko Nestor Ivanovich");
        teachers.add(9,"Orlov Trofim Vladimirovich");
        teachers.add(10,"Solovyov Orest Maksimovich");




        List<String> namesStartingWithN = teachers.stream()
                .filter(teacher -> teacher.getName().startsWith("N"))
                .map(Teacher::getName)
                .collect(Collectors.toList());
    }
    }
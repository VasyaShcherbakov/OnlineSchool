package OnLIneScool.entyty;

import java.util.ArrayList;
import java.util.List;

class MainEntyty {
    public static void main(String[] args) {
        List<Lectures> lecturesList = new ArrayList<>();
        Lectures lectures = new Lectures(1,"Grabchak Austin Viktorovich");
        Lectures lectures1 = new Lectures(2,"Savenko Ivan Anatolievich");
        Lectures lectures2 = new Lectures(3,"Pavlenko Charles Yukhimovich");
        Lectures lectures3 = new Lectures(4,"Rybakov Immanuel Anatolievich");
        Lectures lectures4 = new Lectures(5,"Moiseenko Erik Yukhimovich");


        lecturesList.add(lectures);
        lecturesList.add(lectures1);
        lecturesList.add(lectures2);
        lecturesList.add(lectures3);
        lecturesList.add(lectures4);


        List<Lectures> sortedList = lecturesList.stream()
                .sorted((l1 l2) -> l1.teacher.compareTo(l2.teacher))
                .collect(Collectors.toList());

        System.out.println(sortedList);


    }
}
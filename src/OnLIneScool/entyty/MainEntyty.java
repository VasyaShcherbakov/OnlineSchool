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
        Repo repo = new Repo();

        List<Person> personList = repo.getListOfPersons();
        personList.add(1, "email1@mail.com"));
        personList.add(2, "email2@mail.com"));
        personList.add(3, "email3@mail.com"));
        personList.add(4, "email4@mail.com"));
        personList.add(5, "email5@mail.com"));
        personList.add(6, "email6@mail.com"));
        personList.add(7, "email7@mail.com"));
        personList.add(8, "email8@mail.com"));
        personList.add(9, "email9@mail.com"));
        personList.add(10, "email1@mail.com")); // email1@mail.com - дубликат

        List<Person> filteredList = personList.stream()
                .map(person -> {
                    if (personList.stream().filter(p -> p.getEmail().equals(person.getEmail())).count() > 1) {
                        person.setEmail("DUPLICATE"); // установка метки для дубликата
                    }
                    return person;
                })
                .collect(Collectors.toList());
       /* List<Students> StudentsList = new ArrayList<>();
        StudentsList.stream().filter(students -> students.getEmal);*/
        

    }
}
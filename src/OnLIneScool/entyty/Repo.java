package OnLIneScool.entyty;

import java.util.ArrayList;
import java.util.List;

public class Repo {
    public List<Person> getListOfPersons() {
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            person.setId(i); // установка id
            person.setEmail("email_" + i + "@example.com"); // установка email
            persons.add(person); // добавление созданного объекта в лист
        }
        return persons; // возврат заполненного листа
    }

}
package course2.entyty;

public class MainEntyty {
    public static void main(String[] args) {

        Teacher teacher = new Teacher(1,"Khodota","Pylypovych",95);
        Teacher.count++;
        Teacher teacher1 = new Teacher(2,"Ladyslav","Semenovych",80);
        Teacher.count++;
        Teacher teacher2 = new Teacher(3,"Yukhym","Fedorovych",95);
        Teacher.count++;
        Students students = new Students(4,"Yuniya","Adrianivna",70);
        Students.count++;
        Students students1 = new Students( 5,"Yovilla","Romanivna",80);
        Students.count++;
        Students students2 = new Students(6,"Yulianiya","Cheslavivna",75);
        Students.count++;
        Lectures lectures = new Lectures(7,"Dzvenyslava","Naydenivna",80);
        Lectures.count++;
        Lectures lectures1 = new Lectures(8,"Mariamna","Zlativna",90 );
        Lectures.count++;
        Lectures lectures2 = new Lectures(9,"Ester","Svitanivna",85);
        Lectures.count++;

     teacher.count();
     lectures.count();
     students.count();
    }

}




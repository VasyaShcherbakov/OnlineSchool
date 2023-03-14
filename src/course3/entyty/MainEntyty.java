package course3.entyty;

public class MainEntyty {

    public static void main(String[] args) {
        Lectures lectures = new Lectures(1,"Yulyna","Cheslavivna",95);
        Lectures.count++;
        Lectures lectures1 = new Lectures(2,"Zemfira","Vadymivna",70);
        Lectures.count++;
        Lectures lectures2 = new Lectures(3," Daryna","Bazhanivna",80);
        Lectures.count++;
        Students students = new Students(4,"Daryna","Bazhanivna",95);
        Students.count++;
        Students students1 = new Students(5,"Asya","Borysivna",75);
        Students.count++;
        Students students2 = new Students(6,"Fylitsytata","Artemivna",80);
        Students.count++;
        Teacher teacher = new Teacher(7,"Palahna","Tykhonivna",85);
        Teacher.count++;
        Teacher teacher1 = new Teacher(8,"Zoreslava","Antonivna",85);
        Teacher.count++;
        Teacher teacher2 = new Teacher(9," Yudykhva","Ihorivna",90);
        Teacher.count++;


        lectures.count();
        students.count();
        teacher.count();



    }
}

package OnLIneScool.entyty;

public class StudentsThread extends Thread {
    private Students[] students;
    @Override
    public  void run(){
        for (Students students1:students){
            System.out.println("ID:"+students1.getId()+"Homework:"+students1.getId());
        }
    }
}

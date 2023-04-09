package OnLIneScool.entyty;
import java.util.Arrays;

public class StudentsRepository extends SuperRepositoriy {

    public static  Students[]students;

    public static void createStudentsArray (final int lenght)
    {
        if (students != null)
        {
            return;
        }
        students = new Students[lenght];
    }
}
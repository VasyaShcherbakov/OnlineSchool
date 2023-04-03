package OnLIneScool.entyty;
import java.util.Arrays;
import java.util.Random;

public class TeacherRepository {
    public static  Teacher[]teachers;
    public static void createTeacherArray (final int lenght)
    {
        if (teachers != null)
        {
            return;
        }
        teachers = new Teacher[lenght];
    }



}

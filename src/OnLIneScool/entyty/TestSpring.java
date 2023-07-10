package OnLIneScool.entyty;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = ClassPathXmlApplicationContext (applicationContext.xml);
        context.getBean (testBean);
    }
}

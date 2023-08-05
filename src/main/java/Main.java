import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Main {
    public static void main(String[] args) {
    final ApplicationContext ctx = new GenericApplicationContext(JpaConfig.class);
        FlowerService microService = ctx.getBean(FlowerService.class);






    }
}
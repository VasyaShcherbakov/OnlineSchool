package OnLIneScool.entyty;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
public class AbstractRepository {
    @SneakyThrows
    public static Connection createCon() {
        final String url = "jdbc:postgresql://localhost:5432/first";
        final String username = "postgres";
        final String password = "root";
        Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
        return DriverManager.getConnection(url, username, password);
    }

}

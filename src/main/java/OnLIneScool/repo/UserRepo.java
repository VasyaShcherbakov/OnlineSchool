package OnLIneScool.repo;
import OnLIneScool.entyty.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepo extends JpaRepository<User, Long>  {
    User findByUsername(String nickname);
}

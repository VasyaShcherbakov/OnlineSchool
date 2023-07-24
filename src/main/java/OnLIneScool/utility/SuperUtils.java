package main.java.OnLIneScool.utility;
import org.hibernate.SessionFactory;
import OnLIneScool.entyty.Flower;
import javax.persistence.criteria.*;
import java.util.List;
public class SuperUtils {
    public List<Flower> getFlowers() {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            final CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            final CriteriaQuery<Flower> criteriaQuery = criteriaBuilder.createQuery(Flower.class);

            Root<Flower> root = criteriaQuery.from(Flower.class);
            criteriaQuery.select(root);
            final Query<Flower> query = session.createQuery(criteriaQuery);
            return query.getResultList();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

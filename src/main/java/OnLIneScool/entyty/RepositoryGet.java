package main.java.OnLIneScool.entyty;

import main.java.OnLIneScool.entyty.HomeWork;
import main.java.OnLIneScool.entyty.Lectures;
import main.java.OnLIneScool.entyty.Students;
import main.java.OnLIneScool.entyty.Teacher;
import org.hibernate.IdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;


public class RepositoryGet {
    public static void getDevice(Integer integer) {
        Session session = SessionCreator.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query usersQuery = session.createQuery("from Device where id = :idDevice", Device.class);
        usersQuery.setParameter("idDevice", integer);
        System.out.println(usersQuery.getSingleResult());
        transaction.commit();
        session.close();
    }

}

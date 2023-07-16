package main.java.OnLIneScool.entyty;

class MainEntyty {
    public static void main(String[] args) {
        Session session = SessionCreator.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query usersQuery = session.createQuery("from Device where id = :idDevice", Device.class);
        usersQuery.setParameter("idDevice", integer);
        System.out.println(usersQuery.getSingleResult());
        transaction.commit();
        session.close();

        }
}










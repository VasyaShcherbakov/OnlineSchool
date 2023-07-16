package main.java.OnLIneScool.entyty;

public class Test {
    public static void main(String[] args) {
        final Students students = new Students();
        students.setName("test");
        final Boolean isSave = RepositoryGet.saveStudents(students);
        System.out.println(isSave);
        final Flower flower = new Flower();
        flower.setName("test");

        final Boolean isSave = RepositoryGet.saveFlower(flower);
        System.out.println(isSave);

        final Flower flower1 = RepositoryGet.getFlower(flower.getId());
        System.out.println(flower1);

        flower1.setName("flower");

        final Boolean isUpdate = RepositoryGet.updateFlower(flower1);
        System.out.println(isUpdate);

        final Boolean isDelete = RepositoryGet.deleteFlower(flower1);
        System.out.println(isDelete);

        final Order order = new Order();
        order.setDescription("Pizza");
        order.setName("first");

        final ContactPerson contactPerson = new ContactPerson();
        contactPerson.setUsername("Jon");
        contactPerson.setPhoneNumber("+1885487547");
        contactPerson.setEmail("jon@gmail.com");

        order.setContactPerson(contactPerson);

        final Boolean isOrder = RepositoryGet.saveOrder(order);
        System.out.printf("is order %s%n", isOrder);

        System.out.println(RepositoryGet.getOrder(order.getId()));

    }

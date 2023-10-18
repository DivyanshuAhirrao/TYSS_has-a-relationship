package assignments.has_a_relationship.p2;

public class MainApp {
    public static void main(String[] args) {
        Person p1 = new Person("First","Last","26/10/2000");

        System.out.println(p1.getFirstName());
        System.out.println(p1.getLastName());
        System.out.println(p1.getDOB());

    }
}

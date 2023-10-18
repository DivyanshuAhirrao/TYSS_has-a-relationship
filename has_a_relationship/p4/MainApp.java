package assignments.has_a_relationship.p4;

public class MainApp {
    public static void main(String[] args) {

        //mobileDetails();
        Mobile m = new Mobile("Apple", 79999,256);
        m.MobileDetails();

        System.out.println(m.getBattery().getBatryCapacity());

    }
}

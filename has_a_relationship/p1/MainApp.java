package assignments.has_a_relationship.p1;

public class MainApp {
    public static void main(String[] args) {
        BIKE b1 = new BIKE(9488, 2019);
//
        System.out.println("Model Number of bike is : "+b1.getModelNo());
        System.out.println("Purchase Year of bike is : "+b1.getYear());
        System.out.println("Engine Type of bike is : "+b1.getEngine().getEngineType());
        System.out.println("Top speed of bike is : "+b1.getEngine().getTopSpeed());
    }
}
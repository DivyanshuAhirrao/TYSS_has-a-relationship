package assignments.has_a_relationship.p3;

public class MainApp {
    public static void main(String[] args) {
        ProjectManager pm = new ProjectManager("Lal Singh", 159);
        pm.getProject().projectDetails();
    }
}

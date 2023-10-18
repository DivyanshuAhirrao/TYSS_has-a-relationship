package assignments.has_a_relationship.p3;

public class ProjectManager {
    private String Name;
    private int empID;
    private Project p =  new Project("Java", "TYSS");

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getEmpID() {
        return empID;
    }
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public ProjectManager(String name, int empID) {
        setName(name);
        setEmpID(empID);
    }
    public Project getProject() {
        return p;
    }
}

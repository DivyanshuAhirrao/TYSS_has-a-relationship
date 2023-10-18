package assignments.has_a_relationship.p9;

public class TeamLead {
    private String name;
    private int empID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public TeamLead(String name, int empID) {
        this.name = name;
        this.empID = empID;
    }

    public TeamLead(){

    }

    public void teamLeadDetails(){
        System.out.println(name);
        System.out.println(empID);
    }

}

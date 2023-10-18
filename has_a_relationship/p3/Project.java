package assignments.has_a_relationship.p3;

public class Project {
    private String projName;
    private String projID;
    public Project() {

    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public String getProjID() {
        return projID;
    }

    public void setProjID(String projID) {
        this.projID = projID;
    }

    public Project(String projName, String projID) {
        setProjName(projName);
        setProjID(projID);
    }

    public void projectDetails(){
        System.out.println(getProjName());
        System.out.println(getProjID());
    }

}

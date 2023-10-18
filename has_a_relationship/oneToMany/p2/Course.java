package assignments.has_a_relationship.oneToMany.p2;

import java.security.SecureRandom;

public class Course {
    private String courseName;
    private String proffName;

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getProffName() {
        return proffName;
    }
    public void setProffName(String proffName) {
        this.proffName = proffName;
    }
    public Course(String courseName, String proffName) {
        this.courseName = courseName;
        this.proffName = proffName;
    }
    public Course(){
    }

}

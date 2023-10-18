package assignments.has_a_relationship.p2;

import com.sun.deploy.ui.AboutDialog;

public class Person {
    private String firstName;
    private String lastName;
    private String DOB;
    private Aadhar a = new Aadhar(78945623132L, "Pune" );;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public Person(String firstName, String lastName, String DOB) {
        setFirstName(firstName);
        setLastName(lastName);
        setDOB(DOB);
    }
    Aadhar getAdhar(){
        return a;
    }

}

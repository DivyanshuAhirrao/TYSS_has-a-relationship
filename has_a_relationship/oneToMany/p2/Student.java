package assignments.has_a_relationship.oneToMany.p2;

public class Student {
    private String name;
    private int Id;
    private String course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(String name, int Id, String course) {
        this.name = name;
        this.Id = Id;
        this.course = course;
    }
    public Student(){

    }

}

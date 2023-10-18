package assignments.has_a_relationship.oneToMany.p2;

import java.util.Scanner;

public class College {

    static Scanner sc = new Scanner(System.in);
    private Course course;
    private Student student;
    public Course getCourse(){
        return course;
    }
    public Student getStudent(){
        return student;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public College(Student student) {
        this.student = student;
    }
    public College(){ }

    private Course[] courses= { new Course("Java","Proff1"), new Course("Testing","Proff2") };
    public Course[] getCourses(){
        return courses;
    }
                                                                                                                                                                     //College[] colleges = { new College (new Student("Adams",10,null) , new Course(null,course.getProffName()) )};
    private College[] colleges = { new College (new Student("Adams",10,"h")),
            new College (new Student("Jordan",20,"h")),
            new College (new Student("David",30,"h")),
            new College (new Student("Cane",40,"h")),
            new College (new Student("John",50,"h"))
    };

    public College[] getColleges(){
        return colleges;
    }

    public void showCourses(){
        for (int i=0;i<courses.length;i++) {
            System.out.println(courses[i].getCourseName());
        }
    }
    public void enrollCourse(){
        System.out.println("Select the Java / Testing for following Students :- ");

        for (int i=0;i<colleges.length;i++){
            System.out.println("Enter the Course for "+colleges[i].getStudent().getName()+" :- ");
            String c = sc.next();
            colleges[i].getStudent().setCourse(c);
        }

        for (int i=0;i<colleges.length;i++) {
            System.out.println(colleges[i].getStudent().getName()+" - "+colleges[i].getStudent().getCourse());
        }

    }
}

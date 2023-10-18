package assignments.has_a_relationship.p5;

public class Cm {
    private String name;
    private double experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public Cm(String name, double experience) {
        this.name = name;
        this.experience = experience;
    }

    public void cmDetails(){
        System.out.println(name);
        System.out.println(experience);
    }
}

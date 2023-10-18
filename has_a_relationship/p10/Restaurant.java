package assignments.has_a_relationship.p10;

public class Restaurant {
    private String name;
    private String location;
    private FoodLiscense fl = new FoodLiscense(9988850);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public FoodLiscense getFl() {
        return fl;
    }

    public void setFl(FoodLiscense fl) {
        this.fl = fl;
    }

    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void showLiscense(){
        fl.getLiscenceNum();
    }
}

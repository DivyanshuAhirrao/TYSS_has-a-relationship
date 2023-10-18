package assignments.has_a_relationship.oneToMany.p5;

public class App {
    private String name;
    private int version;
    private double size;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public App(String name, int version, double size){
        this.name = name;
        this.version = version;
        this.size = size;
    }

    public App(){

    }

}

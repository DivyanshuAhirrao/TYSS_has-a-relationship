package assignments.has_a_relationship.p4;

public class Battery {
    private String type;
    private int batryCapacity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBatryCapacity() {
        return batryCapacity;
    }

    public void setBatryCapacity(int batryCapacity) {
        this.batryCapacity = batryCapacity;
    }

    public Battery(String type, int batryCapacity) {
        this.type = type;
        this.batryCapacity = batryCapacity;
    }



}

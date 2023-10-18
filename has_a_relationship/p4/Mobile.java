package assignments.has_a_relationship.p4;

public class Mobile {
    private String brand;
    private double price;
    private int ram;
    private  Battery b = new Battery("Lithium",4800);

    public Mobile() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Battery getBattery() {
        return b;
    }

    public Mobile(String brand, double price, int ram) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }

    public void MobileDetails() {
        System.out.println(b.getType());
        System.out.println(b.getBatryCapacity());
    }
}

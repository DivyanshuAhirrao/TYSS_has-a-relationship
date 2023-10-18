package assignments.has_a_relationship.p6;

public class Computer {
    private String brand;
    private double price;


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

    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }




}


package assignments.has_a_relationship.oneToMany.p3;

public class Shoe {
    private String brand;
    private double price;
    private String color;
    private int size;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public Shoe(String brand, double price, String color, int size) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public Shoe(){

    }

    public void showDetails(){
        System.out.println(brand);
        System.out.println(price);
        System.out.println(color);
        System.out.println(size);
    }


}

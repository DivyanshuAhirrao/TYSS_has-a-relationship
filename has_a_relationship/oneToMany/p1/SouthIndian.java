package assignments.has_a_relationship.oneToMany.p1;

public class SouthIndian {
    private String sDish;
    private double sPrice;

    public String getsDish() {
        return sDish;
    }

    public void setsDish(String sDish) {
        this.sDish = sDish;
    }

    public double getsPrice() {
        return sPrice;
    }

    public void setsPrice(double sPrice) {
        this.sPrice = sPrice;
    }

    public SouthIndian(String sDish, double sPrice) {
        this.sDish = sDish;
        this.sPrice = sPrice;
    }

    public SouthIndian(){ }

    public void displaySFood(){
        System.out.println(sDish);
        System.out.println(sPrice);
    }

}

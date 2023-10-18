package assignments.has_a_relationship.oneToMany.p1;

public class NothIndian {
    private String nDish;
    private double nPrice;

    public String getnDish() {
        return nDish;
    }

    public void setnDish(String nDish) {
        this.nDish = nDish;
    }

    public double getnPrice() {
        return nPrice;
    }

    public void setnPrice(double nPrice) {
        this.nPrice = nPrice;
    }

    public NothIndian(String nDish, double nPrice) {
        this.nDish = nDish;
        this.nPrice = nPrice;
    }
    public NothIndian(){ }

    public void displayNFood(){
        System.out.println(nDish);
        System.out.println(nPrice);
    }
}

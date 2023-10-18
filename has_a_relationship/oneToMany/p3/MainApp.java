package assignments.has_a_relationship.oneToMany.p3;

public class MainApp {
    static ShoeCart s = new ShoeCart();
    public static void main(String[] args) {
        ShoeCart sc = new ShoeCart();
        sc.orderShoes();
        System.out.println("========================================");
        System.out.println("Shoes Filter in low - high price :- ");
        System.out.println();
        printAsc();
    }

    public static void printAsc(){
        double min = s.shoes[0].getPrice();

        for (int i=0; i<s.shoes.length;i++){
            for (int j=i+1;j<s.shoes.length;j++) {

                if (s.shoes[i].getPrice() > s.shoes[j].getPrice()) {
                    Shoe temp = s.shoes[i];
                    s.shoes[i] = s.shoes[j];
                    s.shoes[j] = temp;
                }
            }
        }
        int num =1;

        System.out.println("   Brand  \t\t  Price \t\t Color  \tSize");
        System.out.println("-----------------------------------------------------");
        for (int i=0;i<s.shoes.length;i++){
            System.out.println(num+". "+s.shoes[i].getBrand()+" \t\t "+s.shoes[i].getPrice()+" \t\t "+s.shoes[i].getColor()+" \t\t "+s.shoes[i].getSize());
            num++;
        }
    }
}

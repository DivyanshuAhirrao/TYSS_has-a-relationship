package assignments.has_a_relationship.oneToMany.p3;

import java.util.Scanner;

public class ShoeCart {
    private Shoe shoe;
    public Shoe getShoe(){
        return shoe;
    }



    Shoe[] shoes = {new Shoe("Nike",18999.95,"pink",9),
            new Shoe("Adidas",10499.95,"white",10),
            new Shoe("Zara",8999.95,"green",8),
            new Shoe("Puma",4499.95,"black",9),
            new Shoe("Asics",9999.95,"red",10)
    };


    public void orderShoes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Welcome to ShoeShoppers---------");
        System.out.println();
        System.out.println("   Brand  \t\t  Price \t\t Color  \tSize");
        System.out.println("-----------------------------------------------------");
        int num = 1;
        for (int i=0;i<shoes.length;i++){
            System.out.println(num+". "+shoes[i].getBrand()+" \t\t "+shoes[i].getPrice()+" \t\t "+shoes[i].getColor()+" \t\t "+shoes[i].getSize());
            num++;
        }
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();
        System.out.println("Select the choice number to Order:- ");
        int no = sc.nextInt();

        System.out.println("Your Selected Shoe is :- ");
        System.out.println("Shoe Brand :- "+shoes[no-1].getBrand());
        System.out.println("Shoe Price :- "+shoes[no-1].getPrice());
        System.out.println("Shoe Color :- "+shoes[no-1].getColor());
        System.out.println("Shoe Size :- "+shoes[no-1].getSize());

    }
    public void cancelShoes(){
        System.out.println("Order Canceled Successfully..!!");
    }


}

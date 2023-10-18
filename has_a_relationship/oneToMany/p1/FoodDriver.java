package assignments.has_a_relationship.oneToMany.p1;

import java.util.Scanner;

public class FoodDriver {
    static MenuCard mc = new MenuCard();
    static Scanner sc= new Scanner(System.in);
    static SouthIndian sfood = new SouthIndian();
    static NothIndian nfood = new NothIndian();
    static int dishNum;
    public static void main(String[] args) {



        chooseFood();
        orderFood();

        System.out.println("Confirm the Order :- ");
        System.out.println("1. Confirm");
        System.out.println("2. Cancel");

        int choice = sc.nextInt();
        boolean flag = true;

        while (flag) {
            switch (choice) {
                case 1:
                    payment();
                    break;
                case 2:
                    cancelOrder();
                    break;
                default:
                    System.out.println("Invalid input !!");
            }
        }

    }

    public static void chooseFood(){
        System.out.println("--------------|| South Indian ||-------------");
        System.out.println("_____________________________________________");
        mc.southIndian();
        System.out.println();
        System.out.println("--------------|| North Indian ||-------------");
        System.out.println("_____________________________________________");
        mc.northIndian();
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();

        System.out.println("Choose your Dish number !!");
        FoodDriver.dishNum = sc.nextInt()-1;
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();

    }

    public static void orderFood(){
        if (dishNum>3){
            nfood.setnDish(mc.getNorthindian()[dishNum-4].getnDish());
            nfood.setnPrice(mc.getNorthindian()[dishNum-4].getnPrice());
        }
        else {
            sfood.setsDish(mc.getSouthindian()[dishNum].getsDish());
            sfood.setsPrice(mc.getSouthindian()[dishNum].getsPrice());
        }
        System.out.println("Order Successfully ordered !!");
    }

    public static void payment(){
        System.out.println("You Bill :- ");
        if (dishNum>3) {
            System.out.println("Rs "+mc.getNorthindian()[dishNum-3].getnPrice()+"/- only !!");
        }
        else {
            System.out.println("Rs "+mc.getSouthindian()[dishNum].getsPrice()+"/- only !!");
        }
    }

    public static void cancelOrder(){
        if (dishNum>3){
            nfood.setnDish(null);
            nfood.setnPrice(0.0);
        }
        else {
            sfood.setsDish(null);
            sfood.setsPrice(0.0);
        }
        System.out.println("Order Cancelled successfully !! ");
    }

}

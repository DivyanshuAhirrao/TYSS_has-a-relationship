package assignments.has_a_relationship.oneToMany.p5;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        AppStore as = new AppStore();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Apps you want to install");
        int no = sc.nextInt();

        for (int i=0;i<no;i++){
            as.installApp();
        }

    }
}

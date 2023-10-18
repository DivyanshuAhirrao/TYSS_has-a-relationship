package assignments.has_a_relationship.oneToMany.p5;

import com.sun.javafx.scene.EnteredExitedHandler;

import java.util.Arrays;
import java.util.Scanner;
public class AppStore {
    App[] apps = {new App("Fifa",23,849.36 ),
            new App("Pubg",20,1949.38 ),
            new App("Maps",19,59.34 ),
            new App("Notes",13,25.56 ),
            new App("Snap",66,424.23 ),
            new App("Insta",38,223.12 ),
            new App("Whats",15,163.65 ),
            new App("Tele",21, 280 )};

    public void installApp(){

        for (int a = 0;a<=apps.length-1;a++){
            System.out.println(a+1+". "+ apps[a].getName()+" \t "+apps[a].getVersion()+" \t "+apps[a].getSize());
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Enter the Application Details to install !!");

        Scanner sc= new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the Name of an App :- ");
        String an = sc.next();
        System.out.println("Enter the Version of an App :- ");
        int ver = sc.nextInt();
        System.out.println("Enter the Size of an App :- ");
        double siz = sc.nextDouble();
        System.out.println("----------------------------------------------------------");

        boolean flag = true;

        for (int a=0;a<apps.length;a++) {

            if (apps[a].getName().equalsIgnoreCase(an)) {
                System.out.println("Apps cannot be Duplicate");
                flag=false;
                break;
            }
            }
        if(flag)
        {
            apps = Arrays.copyOf(apps, apps.length + 1);
            apps[apps.length-1] = new App(an, ver, siz);

            System.out.println("App inserted successfully !!");
            System.out.println("______________________________________________");
            System.out.println();

            for (int a1 = 0; a1 < apps.length; a1++) {
                System.out.println(a1+1+ ". " + apps[a1].getName() + " \t " + apps[a1].getVersion() + " \t " + apps[a1].getSize());
            }
        }
            System.out.println("----------------------------------------------");
            System.out.println();

            System.out.println("Do you wanna Search App ??");
            System.out.println("1. Yes");
            System.out.println("2. No");

            int ch = sc.nextInt();

            if (ch == 1){
                searchApp();
            }
            else {
                System.out.println("Thank you !!");
            }

    }

    public void uninstallApp(){

    }

    public void searchApp(){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the App to Search :- ");
        String name = sc.next();

        String index = null;


        for (int i=0;i<apps.length;i++){
            if (apps[i].getName().equalsIgnoreCase(name)) {
                index = apps[i].getName();
                System.out.println("App found :- "+index);
                break;
            }
            else {
                System.out.println("App not found !!");
            }
        }

        System.out.println("IIIIIII==================IIIIIII");
    }

}

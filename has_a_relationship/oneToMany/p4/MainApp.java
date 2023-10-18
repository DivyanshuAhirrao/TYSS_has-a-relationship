package assignments.has_a_relationship.oneToMany.p4;

public class MainApp {
    public static void main(String[] args) {
        Zomata z = new Zomata();

        System.out.println("    Hotel \t\t Menu\t\tRate GSTno.  ");
        System.out.println("_____________________________________");
        short num = 1;
        for (byte b=0;b< z.getHotels().length;b++){
            System.out.println(num+". "+z.getHotels()[b].getHotelname()+" \t "+z.getHotels()[b].getMenu()+" \t "+z.getHotels()[b].getRatings()+" \t "+z.getHotels()[b].getGstNumber());
            num++;
        }
        System.out.println("_______________________________________________");
        z.sortHotels();
        System.out.println();

        System.out.println("All three Star Food Details :- ");
        System.out.println("_______________________________________________");

        short num1 = 1;
        for (byte b=0;b< z.getHotels().length;b++){
            if (z.getHotels()[b].getRatings() == 3) {
                System.out.println(num1 + ". " + z.getHotels()[b].getHotelname() + " \t " + z.getHotels()[b].getMenu() + " \t " + z.getHotels()[b].getRatings() + " \t " + z.getHotels()[b].getGstNumber());
                num1++;
            }
        }
    }
}

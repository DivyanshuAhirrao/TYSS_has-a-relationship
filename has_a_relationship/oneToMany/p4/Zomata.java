package assignments.has_a_relationship.oneToMany.p4;

public class Zomata {
    private Hotel hotel;

    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    private Hotel[] hotels = { new Hotel("Pavbhaji","Juhu-Beach",2,98985),
            new Hotel("Bun-Maska","Irani-Cafe",3,98568),
            new Hotel("Paratha","Mini-Punjab",4,96780),
            new Hotel("Ice-cream","Naturals",3,94451),
            new Hotel("Biryani","Masaledar",5,91375)
            };

    public Hotel[] getHotels(){
        return hotels;
    }

    public void sortHotels(){
        for (byte b=0;b< hotels.length;b++){
            for (int a=b+1;a< hotels.length;a++){
                Hotel temp;
                if (hotels[b].getRatings() < hotels[a].getRatings()){
                    temp = hotels[b];
                    hotels[b] = hotels[a];
                    hotels[a] = temp;
                }
            }
        }
        System.out.println("Sorted Hotels by thier High-Ratings :- ");
        System.out.println();
        short num = 1;
        for (byte b=0;b< hotels.length;b++){
            System.out.println(num+". "+hotels[b].getHotelname()+" \t "+hotels[b].getMenu()+" \t "+hotels[b].getRatings()+" \t "+hotels[b].getGstNumber());
            num++;
        }
    }


}

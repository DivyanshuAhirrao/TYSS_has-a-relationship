package assignments.has_a_relationship.oneToMany.p4;

import java.awt.*;

public class Hotel {
    private String menu;
    private String hotelname;
    private int ratings;
    private int gstNumber;


    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public int getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(int gstNumber) {
        this.gstNumber = gstNumber;
    }

    public Hotel(String menu, String hotelname, int ratings, int gstNumber) {
        this.menu = menu;
        this.hotelname = hotelname;
        this.ratings = ratings;
        this.gstNumber = gstNumber;
    }

    public Hotel(){

    }


}






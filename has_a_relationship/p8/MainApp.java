package assignments.has_a_relationship.p8;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Company[] cmp = { new Company("Apple","Steve Jobs","USA", new Gst(4665)),
                          new Company("Samsung","Yuan Hun","Korea", new Gst(2665)),
                          new Company("Bharat Pe","Ashneer Singh","INDIA", new Gst(3665)),
                          new Company("Boat","Aman Gupta","INDIA", new Gst(2661)),
                          new Company("Microsoft","Bill Gates","Google", new Gst(3662))
                        };

        int min = (int) cmp[0].getGst().getGstNum();

        for (int i=0;i< cmp.length;i++){
            for (int j=i+1;j< cmp.length;j++){
                Company temp;
                if (cmp[i].getGst().getGstNum() > cmp[j].getGst().getGstNum()){
                    temp = cmp[i];
                    cmp[i] = cmp[j];
                    cmp[j] = temp;

                }
            }
        }

        for (int a=0;a< cmp.length;a++){
            System.out.println("Company Name :- "+cmp[a].getName());
            System.out.println("Company CEA  :- "+cmp[a].getCeoName());
            System.out.println("Company LOC  :- "+cmp[a].getLoc());
            System.out.println("GST number   :- "+cmp[a].getGst().getGstNum());
            System.out.println("---------------------------------------------");
            System.out.println();
        }

    }
}

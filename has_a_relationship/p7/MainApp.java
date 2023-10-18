package assignments.has_a_relationship.p7;

public class MainApp {
    public static void main(String[] args) {

        App[] app = { new App("Paytm",512, new Patent(40,"Apple")),
                new App("Paytm",512 , new Patent(80,"Guava")),
                new App("Guffers",64, new Patent(60,"Berry")),
                new App("Zomato",846, new Patent(50,"Jack")),
                new App("CRED",712, new Patent(20,"Water")),
                new App("AngelCo",356, new Patent(70,"Pine")),
                new App("IRCTC",478, new Patent(90,"Carot")),
                new App("Blinkt",128, new Patent(30,"Pepper"))};


        int min = app[0].getPatent().getPatentNum();

        for (int i=0;i< app.length;i++){
            if (app[i].getPatent().getPatentNum() < min){
                min = app[i].getPatent().getPatentNum();
            }
        }

        System.out.println("The Smallest Patent is :- "+min);
    }
}
























//        App a = new App("CRED", 864);
//
//        a.addPatent(new Patent(50));
//        a.addPatent(new Patent(30));
//        a.addPatent(new Patent(90));
//        a.addPatent(new Patent(20));
//        a.addPatent(new Patent(60));
//        a.addPatent(new Patent(100));
//        a.addPatent(new Patent(70));
//        a.addPatent(new Patent(40));



//        app[0] =

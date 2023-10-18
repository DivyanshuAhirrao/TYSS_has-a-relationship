package assignments.has_a_relationship.oneToMany.p1;

public class MenuCard {
    private SouthIndian[] southFood = {new SouthIndian("Idli",25.00),new SouthIndian("Vada",34.95), new SouthIndian("Dosa",49.95) };
    private NothIndian[] northFood = {new NothIndian("Chaap",79.98), new NothIndian("Lassi",45.50), new NothIndian("Chole",59.90) };

    public SouthIndian[] getSouthindian(){
        return southFood;
    }
    public NothIndian[] getNorthindian(){
        return northFood;
    }

    int num = 1;
    public void northIndian(){
        for (int i=0;i<northFood.length;i++){
            System.out.println(num+". Dish :- "+northFood[i].getnDish()+"  |  "+"Price :- "+northFood[i].getnPrice());
            num++;
        }
    }
    public void southIndian(){
        for (int i=0;i<southFood.length;i++){
            System.out.println(num+". Dish :- "+southFood[i].getsDish()+"  |  "+"Price :- "+southFood[i].getsPrice());
            num++;
        }
    }

}

package assignments.has_a_relationship.oneToMany.p2;

import java.awt.*;

public class Colege {

    Colege(){}
    Colege(Student s){};

    private Colege[] coleges = { new Colege(new Student("Demo1",12,"JAva")),
            new Colege(new Student("Demo2",15,"C++")),
            new Colege(new Student("Demo3",18,"R")),
    };
    public Colege[] getColeges(){
        return coleges;
    }
    public void showColges(){
        for (int i=0;i<coleges.length;i++) {
            System.out.println(getColeges()[i]);
        }
    }

}

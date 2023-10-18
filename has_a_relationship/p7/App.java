package assignments.has_a_relationship.p7;

public class App {
    private String name;
    private int size;
    private Patent patent = new Patent();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Patent getPatent() {
        return patent;
    }

    public void setPatent(Patent patent) {
        this.patent = patent;
    }

    public App(){

    }
    public App(String name, int size, Patent patent) {
        this.name = name;
        this.size = size;
        this.patent = patent;
    }


    //    private Patent[] petents = new Patent[8];
//
//    public Patent[] getPatents() {
//        return petents;
//    }
//    int index =0;
//    public void addPatent(Patent patentNum){
//        if (index < petents.length){
//            petents[index++] = patentNum;
//        }
//    }

    public void showPatent(Patent p){
        p.patentDetails();
    }

}

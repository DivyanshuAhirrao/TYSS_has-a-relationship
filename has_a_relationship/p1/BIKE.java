package assignments.has_a_relationship.p1;

public class BIKE {
    private int modelNo;
    private int year;
    private Engine e =  new Engine("Quadrajet", 210);;

    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine(){
        return e;
    }

    public BIKE(int modelNo, int year) {
        setModelNo(modelNo);
        setYear(year);
    }

    public BIKE() {
    }
}

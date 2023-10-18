package assignments.has_a_relationship.p7;

public class Patent {
    private int patentNum;
    private String ownerShip;

    public Patent(int patentNum) {
        this.patentNum=patentNum;
    }

    public int getPatentNum() {
        return patentNum;
    }

    public void setPatentNum(int patentNum) {
        this.patentNum = patentNum;
    }

    public String getOwnerShip() {
        return ownerShip;
    }

    public void setOwnerShip(String ownerShip) {
        this.ownerShip = ownerShip;
    }

    public Patent(int patentNum, String ownerShip) {
        this.patentNum = patentNum;
        this.ownerShip = ownerShip;
    }

    public Patent() {
    }

    void patentDetails(){
        System.out.println(patentNum);
        System.out.println(ownerShip);
    }
}

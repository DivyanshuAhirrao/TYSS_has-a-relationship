package assignments.has_a_relationship.p2;

public class Aadhar {
    private long AdharNum;
    private String address;

    public long getAdharNum() {
        return AdharNum;
    }

//    private Person p = new Person("F","L","2000");
//    Person getPerson(){
//        return p;
//    }

    public void setAdharNum(long adharNum) {
        AdharNum = adharNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Aadhar(long adharNum, String address) {
        setAdharNum(adharNum);
        setAddress(address);
    }

}

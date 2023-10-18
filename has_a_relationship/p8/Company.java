package assignments.has_a_relationship.p8;

public class Company {
    private String Name;
    private String CeoName;
    private String Loc;
    private Gst gst;

    public Gst getGst(){ return gst; }
    public void setGst(Gst gst) {
        this.gst = gst;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCeoName() {
        return CeoName;
    }

    public void setCeoName(String ceoName) {
        CeoName = ceoName;
    }

    public String getLoc() {
        return Loc;
    }

    public void setLoc(String loc) {
        Loc = loc;
    }

    public Company(String name, String ceoName, String loc, Gst gst) {
        Name = name;
        CeoName = ceoName;
        Loc = loc;
        this.gst = gst;
    }

    public Company() {
    }



    public void getGst(Gst gst){
        gst.showGst();
    }
}

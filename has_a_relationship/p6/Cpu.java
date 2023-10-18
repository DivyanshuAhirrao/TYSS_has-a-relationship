package assignments.has_a_relationship.p6;

public class Cpu {
    private String systemName;
    private int cpuID;

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public int getCpuID() {
        return cpuID;
    }

    public void setCpuID(int cpuID) {
        this.cpuID = cpuID;
    }

    public Cpu(String systemName, int cpuID) {
        this.systemName = systemName;
        this.cpuID = cpuID;
    }

    public static void cpuSpecs(){
        Cpu c = new Cpu("Dell", 125);
        System.out.println(c.systemName);
        System.out.println(c.cpuID);
    }

}

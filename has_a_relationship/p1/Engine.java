package assignments.has_a_relationship.p1;

public class Engine {

    private String engineType;
    private int topSpeed;

    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Engine(String engineType, int topSpeed) {
        setEngineType(engineType);
        setTopSpeed(topSpeed);
    }

    public Engine(String engineType) {
        setEngineType(engineType);
    }

    public Engine(int topSpeed) {
        setTopSpeed(topSpeed);
    }

    public Engine(){

    }
}

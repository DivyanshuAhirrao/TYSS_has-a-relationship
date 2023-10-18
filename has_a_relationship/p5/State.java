package assignments.has_a_relationship.p5;

public class State {
    private String stateName;
    private double stateIncome;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public double getStateIncome() {
        return stateIncome;
    }

    public void setStateIncome(double stateIncome) {
        this.stateIncome = stateIncome;
    }

    public State(String stateName, double stateIncome) {
        this.stateName = stateName;
        this.stateIncome = stateIncome;
    }

    private Cm cm = new Cm("Thakre",12);

    Cm getCm(){
        return cm;
    }
}

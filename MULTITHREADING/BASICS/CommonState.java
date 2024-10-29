package MULTITHREADING.BASICS;

public class CommonState {
    StateName stateName;

    CommonState(StateName name) {
        this.stateName = name;
    }

    public StateName getState() {
        return stateName;
    }

    public void setState(StateName name) {
        this.stateName = name;
    }
}

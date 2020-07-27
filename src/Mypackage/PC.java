package Mypackage;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherboard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    /* Generating getters */
    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherboard() {
        return motherboard;
    }
}

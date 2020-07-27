package Mypackage;

public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    // here is a constructor
    public MotherBoard(String model, String manufacturer, int ramSlots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
    }
    // method
    public void load(String name){
        System.out.println(name + " is now Loading...");
    }
    // here are getters for exposing the private data
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

}

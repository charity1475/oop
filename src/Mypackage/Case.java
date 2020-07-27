package Mypackage;

import java.awt.*;

public class Case {
    private String model;
    private String size;
    private String power;
    private Dimension dimension;
    // defining a constructor for above variables
    public Case(String model, String size, String power, Dimension dimension) {
        this.model = model;
        this.size = size;
        this.power = power;
        this.dimension = dimension;
    }
  public void pressPowerButton(){
      System.out.println("Power button pressed....");
  }
    // getters
    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getPower() {
        return power;
    }

    public Dimension getDimension() {
        return dimension;
    }
}

package Mypackage;

public class Animal {
    private String name;
    private int brain;
    private int height;
    private int weight;
    //creating a constructor

    public Animal(String name, int brain, int height, int weight) {
        this.name = name;
        this.brain = brain;
        this.height = height;
        this.weight = weight;
    }
    // creating common methods
    public void eat(){

    }
    public void move(){

    }

    //creating getters

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}

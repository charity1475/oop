package Mypackage;

public class Dog extends Animal{
    // creating special properties for dogs before inheriting the common one
    private int eyes;
    private int legs;
    private int breast;

    // Generating the class constructor
    public Dog(String name, int brain, int height, int weight,int eyes,int legs,int breast) {
        super(name, brain, height, weight);
        //adding the special attributes of a dog
        this.breast = breast;
        this.eyes = eyes;
        this.legs = legs;
    }
    // here i need to override the method eat from animal class

    private void chew(){
        System.out.println("Dogs Eat by chewing");
    }

    @Override
    public void eat(String material) {
        chew();
        // specifying a method from a superclass
        super.eat(material);
    }
}

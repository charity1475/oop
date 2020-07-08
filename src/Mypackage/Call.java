package Mypackage;

public class Call {
    public static void main(String[] args){
        //constructing an object for Animal class
        Animal animal = new Animal("Animal",1,1,10);
        //constructing class for dog
        Dog dog = new Dog("Timmy",1,1,10,2,4,6);
        dog.eat("Meat");
        dog.move("Walking with four legs");

    }
}

package Mypackage;

public class Call {
    public static void main(String[] args){
        //constructing an object for Animal class
        Animal animal = new Animal("Animal",1,1,10);
        //constructing class for dog
        Dog dog = new Dog("Timmy",1,1,10,2,4,6);
        dog.eat("Meat");
        dog.move("Walking with four legs");
        // constructing a fish as an object
        Fish fish = new Fish("Tortoise",1,1,1,2,2);
        fish.eat("Sea Organics and Insects");
        fish.move("swimming");

    }
}

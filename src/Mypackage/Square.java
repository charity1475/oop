package Mypackage;
interface Inhere{
    void say();
}

public class Square {
    public static void called(){
        System.out.println("I'm a method reference");
    }
    public static void main(String[] args){
        // here defining a square
        Squares s = new Squares(4);
        // here defining the shape
        Shapes shapes =(Squares squares)-> {
                return squares.area();
            };
        System.out.println("The area is "+ shapes.getArea(s));
        // calling the method reference(compact and easy form of lambda)
        Inhere method = Square::called;
        method.say();
    }
}

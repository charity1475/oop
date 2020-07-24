package Mypackage;

public class Square {
    public static void main(String[] args){
        // here defining a square
        Squares s = new Squares(4);
        // here defining the shape
        Shapes shapes =(Squares squares)-> {
                return squares.area();
            };
        System.out.println("The area is "+ shapes.getArea(s));
    }
}

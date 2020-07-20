package Mypackage;
// here is the interface
interface Consumer{
    int add();
}
// interface time
interface Timed{
    public int time =2;
    void hours();
}
public class Interfaces {
    public static void main(String[] args){
        //creating a constructor for the interface class
        Consumer salary = new Consumer() {
            @Override
            public int add() {
                System.out.println("The interface has been called ");
                int num=(10*3-19);
                System.out.println("Salary is " + num +" $");
                return num;
            }
        };
        salary.add();
        // calling another interface
        Timed time=()->System.out.println("He is a full time lancer");
        // calling a method from the consumer defined class
        time.hours();
    }
}

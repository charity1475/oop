package Mypackage;

public class ThreadClass extends Thread {
    @Override
    public void run(){
        int i =1;
        while (i<=20){
            System.out.println(i+ " The name is "+ this.getName());
            ++i;
        }
    }
}

package Mypackage;
/* Since implementing thread by extending from a class means we can't
* extend from other classes hence the best option is to use runnable interfaces */
public class RunnableThread implements Runnable {
    @Override
    public void run(){
        int i =1;
        while (i<=20){
            System.out.println(i+ " The name is "+ Thread.currentThread().getName());
            ++i;
        }
    }
}

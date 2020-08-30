package Mypackage;

public class RunThread {
    public static void main(String[] args){
        ThreadClass thread1 = new ThreadClass();
        Thread runnable= new Thread(new RunnableThread());
        thread1.setName(" charity");
        runnable.setName("Hello");
        thread1.start();
        runnable.start();
        System.out.println(Thread.activeCount());
        System.out.println("Both threads run simultaneously");

    }
}

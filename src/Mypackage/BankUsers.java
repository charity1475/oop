package Mypackage;

public class BankUsers {
    static final Synchronized account = new Synchronized(50);
    public static void main(String[] args){
        account.topUp(170);
        Thread tone = new Thread(() ->{
            Atm.withdraw(account, 100);
        });
        Thread two = new Thread(() ->{
            Atm.withdraw(account, 100);
        });
        tone.start();
        two.start();
    }
}

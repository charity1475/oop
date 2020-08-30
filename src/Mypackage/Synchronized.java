package Mypackage;

public class Synchronized {
    /* in some cases we will need consistent transactions that
    * assume we have a method like two people trying to withdraw from
    * money from the same account*/
    private int balance =0;
    private final int overdraft;

    public Synchronized(int overdraft) {
        this.overdraft = overdraft;
    }
    void topUp(int amount){
        balance+=amount;
    }
    void debit(int amount){
        balance -= amount;
    }
    int getBalance(){
        return balance;
    }
    int getOverdraft(){
        return overdraft;
    }
}

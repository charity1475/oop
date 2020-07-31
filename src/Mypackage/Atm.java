package Mypackage;

public class Atm {
    static synchronized void withdraw(Synchronized account, int amount){
        int balance = account.getBalance();
        if((balance-amount) <= account.getOverdraft()){
            System.out.println("Transaction denied");
        }
        else {
            account.debit(amount);
            System.out.println("$ "+amount +" Successful withdrawn");
        }
        System.out.println("Current balance is " + account.getBalance());
    }
}

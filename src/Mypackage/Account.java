package Mypackage;

public class Account {
    // defining attributes of a bank account.
    private String accountNo;
    public double balance = 900000.00;
    public String passcode;
    public String email ="charity@gmail.com", phone = "06221938";
    // setting an account
    public void setAccount(){
        int password = 1475;
        if(passcode.equals(password)){
            this.accountNo = accountNo;
            System.out.println("Welcome " + email);
        }
    }
    // withdraw money
    public double withdraw(double amount){
        if(amount>balance){
            System.out.println("Sorry you don't have enough balance to withdraw ");
        }
        else {
            balance -= amount;
            System.out.println("Successful withdrawn " + amount + " your new balance is " + balance);
            System.out.println("Name " + email);
            System.out.println("Phone " + phone);
            System.out.println("Welcome Again");
        }
        return balance;
    }
    // depositing money
    public double deposit(double amount){
        balance += amount;
        System.out.println("You have success fully deposited " + amount + " Your new balance is " + balance);
        System.out.println("Name " + email);
        System.out.println("Phone " + phone);
        System.out.println("Welcome Again");
        return  balance;
    }
}

package Mypackage;
import java.util.Scanner;
public class Bank {
    public static void main(){
        Scanner stdin = new Scanner(System.in);
        // constructing my account.
        Account crdb = new Account();
        System.out.print(" Welcome At CRDB What's your password...");
        crdb.passcode = stdin.next();
        while (true){
            System.out.println("Here is Your Menu Press\n" +
                    "1 To withdraw\n " +
                    "2 To deposit\n" +
                    "0 To Exit");
            int choice = stdin.nextInt();
            if(choice==0){
                break;
            }
            else if(choice==1){
                System.out.print("How much do want to withdraw...");
                double stake = stdin.nextDouble();
                crdb.withdraw(stake);
            }
            else if (choice==2){
                System.out.print("How much do you want to deposit...");
                double stake = stdin.nextDouble();
                crdb.deposit(stake);
            }
            else
                System.out.println("You have entered a wrong choice");
        }
    }
}

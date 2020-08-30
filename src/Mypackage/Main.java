package Mypackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        // initializing the constructor to object charity.
        Hero charity = new Hero();
        // passing the variables to the class methods.
        System.out.print("What is your name...");
        charity.heroName = stdin.nextLine();
        System.out.print("Your info grade...");
        charity.info = stdin.nextDouble();
        System.out.print("Your math grade...");
        charity.math = stdin.nextDouble();
        System.out.print("Your security grade...");
        charity.security = stdin.nextDouble();
        // updating the private variables in the class.
        System.out.print("What is your registration number...");
        String tudom = stdin.next();
        System.out.print("Please confirm your registration, What's your password...");
        charity.pass = stdin.next();
        charity.setReg(tudom);
        // accessing methods from the class.
        charity.getaverage();
        Bank prize = new Bank();
        prize.main();

    }
}

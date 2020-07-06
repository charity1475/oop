package Mypackage;
import java.util.Scanner;
public class Hero {

        // here is student record template
        public String heroName, pass;
        public double math,security,info;
        // this is a sample private variable.
        private  String reg;
        //defining the methods to operate data
        public double getaverage(){
            double average;
            average = (security + math + info)/3;
            System.out.println("Congratulation " + heroName + " You got " + average);
             return average;
        }
        // this method will update reg.
        public void setReg(String reg){
            String password = "1475";
            if(pass.equals(password)){
                this.reg = reg;
                System.out.println("Your registration has been verified " + reg);
            }
            else
                System.out.println("*** Your registration is incomplete, visit your HOD for mare info ***");
        }

    }

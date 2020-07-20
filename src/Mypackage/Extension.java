package Mypackage;
import javax.xml.namespace.QName;
import java.util.Scanner;

public class Extension extends Abstract {
    public Extension(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void present() {
        String name;
        System.out.println("Called " + this.name+ " by name ");
        System.out.println(age+" By age and that makes me cool.");
        System.out.println(gender+"By Gender");
    }

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        Extension student =new Extension("Charity", "Male", 19);
        student.present();

    }
}

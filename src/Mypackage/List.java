package Mypackage;
import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        ArrayList<String> my_list;
        my_list = new ArrayList<String>();
        System.out.println("Enter just 4 names in");
        for (int i=0;i<4;++i){
            my_list.add(stdin.next());
        }
        System.out.println("The names are "+my_list);
        System.out.println("Add one more name in");
        my_list.add(stdin.next());
        System.out.println("The names are "+my_list);
    }
}

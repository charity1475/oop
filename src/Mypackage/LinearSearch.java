package Mypackage;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        ArrayList<Integer> items;
        items = new ArrayList<Integer>();
        //collecting the elements
        System.out.print("Enter the 10 elements in...");
        for (int i=0;i<10;++i){
            items.add(stdin.nextInt());
        }
        // sorting
        Collections.sort(items);
        System.out.print("What do wanna search..");
        int key = stdin.nextInt();
        for(int i=0;i<10;++i){
        }

    }
}



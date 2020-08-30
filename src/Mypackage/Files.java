package Mypackage;

import java.io.*;

public class Files {
    public static void main(String[] arg){
        File myFile = new File("/home/charity/wget-log");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(myFile));
            String line;
            while ((line = reader.readLine())!= null){
                System.out.println(line);
            }
        }catch (IOException ioe){
            System.out.println(404);
        }
    }
}

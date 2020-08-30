package Mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class FileWriter {
    public static void main(String[] args){
        // for handling resource leaks we can use try with resources
        try( BufferedReader reader = new BufferedReader(new StringReader("Hello World"));
             StringWriter writer = new StringWriter();){
            writer.write(reader.readLine());
            System.out.println(writer.toString());
        }catch (IOException ioe){
            System.out.println(404);
        }
    }
}

package Mypackage;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.FileNameMap;

public class CreateFile{
    public static void main(String[] args){
        File  fileDir = new File("/home/charity/mom");
        fileDir.mkdir();
        File myFile = new File("/home/charity/mom/mom.txt");
        /* Filtering file names */
        try{
            boolean createdFile = myFile.createNewFile();
            if(createdFile==true){
                System.out.println("A text file created ");
            }
        }catch (IOException ieo){

        }
        FilenameFilter filter = (dir, name) -> false;
       String[] contents = new File("/home/charity/mom/").list(filter);
       for (String name: contents){
           System.out.println(name);
       }
    }
}
package Mypackage;

import java.io.File;
import java.io.FilenameFilter;

public class Paths {
   public static void main(String[] args){
       FilenameFilter filter = (file, fileName) -> {
           return fileName.contains(".");
       };

       String[] contents = new File("/home/charity").list(filter);
       for(String file: contents) {
           System.out.println(file);
       }
   }
}

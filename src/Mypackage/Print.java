package Mypackage;
import java.io.*;

public class Print {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("token.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            // append string
            pw.append("Charity is a brave boy" + "\n");
            // flush the writer
            pw.flush();
            System.out.println("Successful saved that");
            pw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
package Mypackage;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Net {
   public static void main(String[] args){
       try(ServerSocket serverSocket= new ServerSocket(5000)){
           Socket socket = serverSocket.accept();
           System.out.println("Connected");
       }catch(IOException e){
           e.printStackTrace();
       }
   }
}

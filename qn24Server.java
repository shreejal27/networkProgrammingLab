//Write a client and server program for text messaging.
// Server:
import java.io.*;
import java.net.*;

public class qn24Server{
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(8080);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String)dis.readUTF();

            System.out.println("Message = " + str);
            ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
//Write a client and server program for text messaging.
// Client:
import java.io.*;
import java.net.*;

public class qn24Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 8080);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello World");
            dout.flush();
            dout.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
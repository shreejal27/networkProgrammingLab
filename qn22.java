//Write a program to display a socket's information

import java.net.*;
import java.io.*;

public class qn22{
    public static void main(String[] args) {
        try{
            Socket s = new Socket("www.example.com", 80);
            System.out.println("Connected to " + s.getInetAddress() + " on port " + s.getPort() + " from port " + s.getLocalPort() + " of " + s.getLocalAddress());
            s.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
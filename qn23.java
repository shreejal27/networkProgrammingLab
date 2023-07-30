//Write a program create DateTime Server.

import java.net.*;
import java.io.*;
import java.util.*;

public class qn23{

    public final static int port = 13;
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(port);
            while(true){
                try(Socket s = ss.accept()){
                    Writer out = new OutputStreamWriter(s.getOutputStream());
                    Date now = new Date();
                    out.write(now.toString() + "\r\n");
                    out.flush();
                    s.close();
                }

            }
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}
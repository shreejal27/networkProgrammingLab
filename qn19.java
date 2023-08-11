// Write a program to read values of HTTP Header fields

import java.io.*;
import java.net.*;

public class qn19 {
    public static void main(String[] args) {

        try{
            URL u = new URL("https://www.facebook.com");
            URLConnection uc = u.openConnection();
            System.out.println("Content-Type: " + uc.getContentType());
            
            if(uc.getContentEncoding()!=null){
                System.out.println("Content-Encoding" + uc.getContentEncoding());
            }
            if(uc.getDate()!=0){
                System.out.println("Date: " + uc.getDate());
            }
            if(uc.getLastModified()!=0){
                System.out.println("Last modified: " + uc.getLastModified());
            }
            if(uc.getExpiration()!=0){
                System.out.println("Expiration date: " + uc.getExpiration());
            }
            if(uc.getContentLength()!=-1){
                System.out.println("Content-Length: " + uc.getContentLength());
            }
        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//Write a program to get hostname using IP address. 

import java.net.*;
public class qn2 {
    public static void main(String[] args) {
        try {

            InetAddress address = InetAddress.getByName("127.0.0.1");
        
            System.out.println("Hostname of " + address.getHostName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
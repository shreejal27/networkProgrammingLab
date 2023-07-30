//Write a program to get hostname using IP address. 

import java.net.*;

public class qn2 {
    public static void main(String[] args) {
        try {
            String ipAddress = "127.0.0.1"; // Replace with the desired IP address
            
            InetAddress address = InetAddress.getByName(ipAddress);
            String hostname = address.getHostName();
            
            System.out.println("Hostname of " + ipAddress + ": " + hostname);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
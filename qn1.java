//Write a program to display IP address of localhost.

import java.net.*;

public class qn1 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("IP Address of localhost: " + address.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
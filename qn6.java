// Write a program to check version of the IP address
import java.net.*;
public class qn6 {
    public static void main(String[] args) {
        String ipAddress = "192.168.0.1"; 
        
        try {
            InetAddress address = InetAddress.getByName(ipAddress);
            
            if (address instanceof Inet4Address) {
                System.out.println(ipAddress + " is an IPv4 address.");
            } else if (address instanceof Inet6Address) {
                System.out.println(ipAddress + " is an IPv6 address.");
            } else {
                System.out.println("Unknown IP address version.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
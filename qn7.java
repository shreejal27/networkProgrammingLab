//Write a program that lists all the network interfaces.
import java.net.*;
import java.util.*;

public class qn7 {

    public static void main(String[] args) throws SocketException {
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        System.out.println("List of network interfaces:");
        while (interfaces.hasMoreElements()) {
            NetworkInterface ni = interfaces.nextElement();
            System.out.println(ni);
            // System.out.println("- " + ni.getName());
        }
    }
}

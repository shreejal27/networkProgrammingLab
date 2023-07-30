
//Write a program to get IPv4 and IPv6 address of a given hostname.
import java.net.InetAddress;
import java.net.UnknownHostException;

public class qn5 {
    public static void main(String[] args) {
        String hostname = "www.example.com"; // Replace with the desired hostname

        try {
            InetAddress[] addresses = InetAddress.getAllByName(hostname);

            System.out.println("IP Addresses for " + hostname + ":");

            for (InetAddress address : addresses) {
                if (address.getHostAddress().contains(":")) {
                    System.out.println("IPv6: " + address.getHostAddress());
                } else {
                    System.out.println("IPv4: " + address.getHostAddress());
                }
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}

// Write a program using InetAddress class to get ip address of a website.
import java.net.InetAddress;

public class qn4 {
    public static void main(String[] args) {
        try {
            String url = "www.example.com"; // Replace with the desired website URL
            
            InetAddress address = InetAddress.getByName(url);
            String hostAddress = address.getHostAddress();
            
            System.out.println("IP Address of " + url + ": " + hostAddress);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

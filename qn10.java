
//Write a program that splits the parts of a URL.
import java.net.*;

public class qn10 {

    public static void main(String[] args) {
        String urlString = "https://www.example.com:8080/path/to/resource?param1=value1&param2=value2#fragment";

        try {
            URL url = new URL(urlString);
            System.out.println("URL is" + url.toString());
            System.out.println("protocol is" + url.getProtocol());
            System.out.println("file is" + url.getFile());
            System.out.println("host is" + url.getHost());
            System.out.println("path is" + url.getPath());
            System.out.println("port is" + url.getPort());
            System.out.println("user is" + url.getUserInfo());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

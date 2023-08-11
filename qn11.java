//Write a program to download a web page of a given webaddress
import java.io.*;
import java.net.*;

public class qn11 {

    public static void main(String[] args) {
        String webAddress = "https://www.google.com"; // Replace with the desired web address

        try {
            String webpageContent = downloadWebPage(webAddress);
            System.out.println("Web page content:\n" + webpageContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String downloadWebPage(String webAddress) throws IOException {
        URL url = new URL(webAddress);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } finally {
            connection.disconnect();
        }

        return content.toString();
    }
}

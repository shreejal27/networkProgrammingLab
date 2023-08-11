// Write a program to download a webpage using URLConnection.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class qn18 {
    public static void main(String[] args) {
        String urlToDownload = "https://www.google.com"; 

        try {
            String webpageContent = downloadWebPage(urlToDownload);
            System.out.println(webpageContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String downloadWebPage(String urlString) throws IOException {
        URL url = new URL(urlString);
        URLConnection connection = url.openConnection();

        // Set a user-agent header to simulate a browser request (some websites may require this)
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");

        // Open a connection to the URL and retrieve the content
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder webpageContent = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            webpageContent.append(inputLine);
            webpageContent.append("\n");
        }

        in.close();
        return webpageContent.toString();
    }
}

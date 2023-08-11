//Write a program that communicates with server through GET 
import java.io.*;
import java.net.*;

public class qn12 {

    public static void main(String[] args) {
        String serverUrl = "http://www.google.com"; 

        try {
            String response = sendGetRequest(serverUrl);
            System.out.println("Server Response:\n" + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String sendGetRequest(String serverUrl) throws IOException {
        URL url = new URL(serverUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");

        StringBuilder responseContent = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
        } finally {
            connection.disconnect();
        }

        return responseContent.toString();
    }
}
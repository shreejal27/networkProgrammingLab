// Write a program for creating secure socket with domain name
import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class qn25 {

    public static void main(String[] args) {
        String domainName = "example.com"; // Replace with the domain name you want to connect to

        try {
            URL url = new URL("https://" + domainName);

            // Open a secure connection
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

            // Set up the connection properties
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000); // 5 seconds timeout
            connection.setReadTimeout(5000);    // 5 seconds read timeout

            // Get the response code
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpsURLConnection.HTTP_OK) {
                // Read the response content
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                System.out.println("Successfully connected to " + domainName);
                System.out.println("Response content:");
                System.out.println(response.toString());
            } else {
                System.out.println("Failed to connect to " + domainName + ". Status code: " + responseCode);
            }

            // Close the connection
            connection.disconnect();

        } catch (Exception e) {
            System.err.println("Error connecting to " + domainName + ": " + e.getMessage());
        }
    }
}

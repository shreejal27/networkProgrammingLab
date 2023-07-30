// Write a program to demonstrate HTTP Request methods.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class qn17 {
    public static void main(String[] args) {
        try {
            // Base URL for the JSONPlaceholder API
            String baseURL = "https://jsonplaceholder.typicode.com";

            // Perform GET request
            System.out.println("GET Request:");
            performGetRequest(baseURL + "/posts/1");

            // Perform POST request
            System.out.println("\nPOST Request:");
            String postRequestBody = "{\"title\":\"New Post\",\"body\":\"Sample body\",\"userId\":1}";
            performPostRequest(baseURL + "/posts", postRequestBody);

            // Perform PUT request
            System.out.println("\nPUT Request:");
            String putRequestBody = "{\"id\":1,\"title\":\"Updated Post\",\"body\":\"Updated body\",\"userId\":1}";
            performPutRequest(baseURL + "/posts/1", putRequestBody);

            // Perform DELETE request
            System.out.println("\nDELETE Request:");
            performDeleteRequest(baseURL + "/posts/1");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void performGetRequest(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println("Response:");
            System.out.println(response.toString());
        } else {
            System.out.println("GET request failed.");
        }
    }

    private static void performPostRequest(String urlString, String requestBody) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        connection.getOutputStream().write(requestBody.getBytes());

        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_CREATED) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println("Response:");
            System.out.println(response.toString());
        } else {
            System.out.println("POST request failed.");
        }
    }

    private static void performPutRequest(String urlString, String requestBody) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("PUT");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        connection.getOutputStream().write(requestBody.getBytes());

        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println("Response:");
            System.out.println(response.toString());
        } else {
            System.out.println("PUT request failed.");
        }
    }

    private static void performDeleteRequest(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("DELETE");

        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println("Response:");
            System.out.println(response.toString());
        } else {
            System.out.println("DELETE request failed.");
        }
    }
}

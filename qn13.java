// Write a program to download an object.
//not done
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class qn13 {

    public static void main(String[] args) {
        String objectUrl = "https://example.com/sample.pdf"; // Replace with the URL of the object you want to download
        String destinationFile = "downloaded_object.pdf"; // Replace with the desired destination file path

        try {
            downloadObject(objectUrl, destinationFile);
            System.out.println("Object downloaded successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void downloadObject(String objectUrl, String destinationFile) throws IOException {
        URL url = new URL(objectUrl);
        URLConnection connection = url.openConnection();

        try (InputStream inputStream = connection.getInputStream();
             FileOutputStream outputStream = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }
    }
}

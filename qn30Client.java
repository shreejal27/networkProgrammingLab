// Write a program for UDP client 
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class qn30Client {

    public static void main(String[] args) {
        try {
            // Create a UDP socket
            DatagramSocket clientSocket = new DatagramSocket();

            // Server address and port
            String serverAddress = "localhost"; // Replace with the server's IP address
            int serverPort = 12345; // Replace with the server's port number

            // Message to be sent to the server
            String message = "Hello, UDP Server!";

            // Convert the message to bytes
            byte[] sendData = message.getBytes();

            // Create a DatagramPacket to send the message to the server
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getByName(serverAddress), serverPort);

            // Send the packet to the server
            clientSocket.send(sendPacket);

            System.out.println("Sent message to the server: " + message);

            // Close the socket
            clientSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

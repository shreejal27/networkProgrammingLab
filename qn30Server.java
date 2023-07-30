// Write a program for UDP server 
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class qn30Server {

    public static void main(String[] args) {
        try {
            // Server port number
            int serverPort = 12345;

            // Create a UDP socket
            DatagramSocket serverSocket = new DatagramSocket(serverPort);

            System.out.println("UDP Server is running and waiting for incoming messages...");

            // Buffer to receive incoming data
            byte[] receiveData = new byte[1024];

            // Create a DatagramPacket to receive data from the client
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

            // Receive data from the client
            serverSocket.receive(receivePacket);

            // Extract the message from the received packet
            String message = new String(receivePacket.getData(), 0, receivePacket.getLength());

            System.out.println("Received message from the client: " + message);

            // Close the socket
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

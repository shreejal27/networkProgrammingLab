// Write a program to demonstrate a UDP Multicast Socket that receives UDP Multicast messages.
import java.io.*;
import java.net.*;

public class qn31{
    public static void main(String[] args) {
        String multicastAddress = "239.255.255.255"; // Replace with the desired multicast address
        int multicastPort = 12345; // Replace with the desired multicast port

        try {
            // Create a multicast socket and join the multicast group
            InetAddress group = InetAddress.getByName(multicastAddress);
            MulticastSocket multicastSocket = new MulticastSocket(multicastPort);
            
            multicastSocket.joinGroup(group);

            System.out.println("UDP Multicast Receiver is ready to receive messages...");

            // Receive and process multicast messages
            byte[] buffer = new byte[1024];
            while (true) {
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                multicastSocket.receive(packet);

                String message = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received message: " + message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// Write a program to list all supported socket options for the different types of network channels
import java.net.*;
import java.nio.channels.*;
import java.util.*;

public class qn27{
    public static void main(String[] args) throws Exception{
        // Get all supported socket options for ServerSocketChannel
        Set<SocketOption<?>> serverSocketOptions = ServerSocketChannel.open().supportedOptions();
        System.out.println("Supported socket options for ServerSocketChannel:");
        for (SocketOption<?> option : serverSocketOptions) {
            System.out.println(option.name());
        }

        // Get all supported socket options for SocketChannel
        Set<SocketOption<?>> socketOptions = SocketChannel.open().supportedOptions();
        System.out.println("\nSupported socket options for SocketChannel:");
        for (SocketOption<?> option : socketOptions) {
            System.out.println(option.name());
        }

        // Get all supported socket options for DatagramChannel
        Set<SocketOption<?>> datagramOptions = DatagramChannel.open().supportedOptions();
        System.out.println("\nSupported socket options for DatagramChannel:");
        for (SocketOption<?> option : datagramOptions) {
            System.out.println(option.name());
        }
    }
}
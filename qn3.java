//Write a program to display MAC address of the host.
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
class Main {
  public static void main(String[] args) {
    try {
      InetAddress address = InetAddress.getLocalHost();

      String macAddress = "";

      //Get MAC Address
      NetworkInterface network = NetworkInterface.getByInetAddress(address);
      byte[] macArray = network.getHardwareAddress();
      StringBuilder str = new StringBuilder();
      // Convert the macArray to String
      for (int i = 0; i < macArray.length; i++) {
        str.append(String.format("%02X%s", macArray[i], (i < macArray.length - 1) ? " ": ""));
        macAddress = str.toString();
      }
      System.out.println("MAC Address: " + macAddress);
    }
    catch(SocketException e) {
      System.out.println(e.getMessage());
    } catch(UnknownHostException e) {
      e.printStackTrace();
    }
  }
}
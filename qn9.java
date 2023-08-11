//write a program to process web server logfiles.
//not working
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class qn9 {

    public static void main(String[] args) {
        String logFilePath = "www.example.com/logfile.txt";
        
        try {
            Map<String, Integer> ipAddressCount = processLogFile(logFilePath);
            printIpAddressCounts(ipAddressCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Integer> processLogFile(String logFilePath) throws IOException {
        Map<String, Integer> ipAddressCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(logFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String ipAddress = extractIpAddress(line);
                if (ipAddress != null) {
                    ipAddressCount.put(ipAddress, ipAddressCount.getOrDefault(ipAddress, 0) + 1);
                }
            }
        }

        return ipAddressCount;
    }

    public static String extractIpAddress(String logEntry) {
        // Assuming the IP address is the first entry in the log entry (space-separated)
        String[] logParts = logEntry.split(" ");
        if (logParts.length > 0) {
            return logParts[0];
        }
        return null;
    }

    public static void printIpAddressCounts(Map<String, Integer> ipAddressCount) {
        System.out.println("IP Address Counts:");
        for (Map.Entry<String, Integer> entry : ipAddressCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

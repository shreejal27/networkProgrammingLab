// Write a program to demonstrate filling and Draining buffer.
import java.nio.ByteBuffer;

public class qn29 {

    public static void main(String[] args) {
        int bufferSize = 10; // Size of the ByteBuffer
        ByteBuffer buffer = ByteBuffer.allocate(bufferSize);

        // Filling the buffer
        String dataToFill = "Hello World";
        byte[] dataBytes = dataToFill.getBytes();

        // Check if the buffer has enough space to store the data
        if (buffer.remaining() >= dataBytes.length) {
            buffer.put(dataBytes); // Fill the buffer with dataBytes
            System.out.println("Buffer filled with data: " + dataToFill);
        } else {
            System.out.println("Buffer does not have enough space to store the data.");
        }

        // Draining the buffer
        buffer.flip(); // Set the buffer's position to 0 and limit to current position
        byte[] drainedDataBytes = new byte[buffer.remaining()];
        buffer.get(drainedDataBytes); // Drain the buffer into drainedDataBytes

        // Convert the bytes back to a String
        String drainedData = new String(drainedDataBytes);

        System.out.println("Data drained from buffer: " + drainedData);
    }
}

//Output : Buffer filled with data: Hello World
//         Data drained from buffer: Hello World
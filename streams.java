import java.io.*;

public class BinaryFileReadWrite {
    public static void main(String[] args) {
       
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("data.bin"))) {
            outputStream.writeInt(123); 
            outputStream.writeDouble(3.14); 
            outputStream.writeUTF("Hello, World!"); 
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.err.println("Error writing data to file: " + e.getMessage());
        }

        
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("data.bin"))) {
            int intValue = inputStream.readInt(); 
            double doubleValue = inputStream.readDouble();
            String stringValue = inputStream.readUTF(); 
            System.out.println("Integer value: " + intValue);
            System.out.println("Double value: " + doubleValue);
            System.out.println("String value: " + stringValue);
        } catch (IOException e) {
            System.err.println("Error reading data from file: " + e.getMessage());
        }
    }
}


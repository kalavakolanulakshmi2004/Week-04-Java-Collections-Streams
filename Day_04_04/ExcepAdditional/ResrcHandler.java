package ExcepAdditional;
import java.io.*;
import java.util.*;
public class ResrcHandler {
    public void manageResource(String fileName) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("Resource cleaned up.");
                }
            } catch (IOException e) {
                System.out.println("Error during resource cleanup: " + e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        ResrcHandler handler = new ResrcHandler();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        handler.manageResource(fileName);
    }
}
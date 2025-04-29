package files;
import java.io.*;
import java.util.Scanner;
public class UpperToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source file path: ");
        String src = sc.nextLine();
        System.out.print("Enter destination file path: ");
        String dest = sc.nextLine();
        try (
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(src), "UTF-8"));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dest), "UTF-8"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
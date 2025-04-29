package files;
import java.io.*;
import java.util.Scanner;
public class ImageByteArrayConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source image path: ");
        String srcPath = sc.nextLine();
        System.out.print("Enter destination image path: ");
        String destPath = sc.nextLine();
        try {
            FileInputStream fis = new FileInputStream(srcPath);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            byte[] imageBytes = baos.toByteArray();
            fis.close();
            baos.close();
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(destPath);
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            bais.close();
            fos.close();
            System.out.println("Image copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
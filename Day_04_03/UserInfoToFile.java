package files;
import java.io.*;
public class UserInfoToFile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            System.out.print("Enter your age: ");
            String age = reader.readLine();
            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();
            FileWriter writer = new FileWriter("Sample.txt");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");
            writer.close();
            System.out.println("User information saved to person_info.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
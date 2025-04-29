import java.util.Scanner;
public class MulTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Multiplication Table of " + n + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        input.close(); 
    }
}

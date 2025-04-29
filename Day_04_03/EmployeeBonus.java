import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter your years of service: ");
        int yearsOfService = input.nextInt();
        if (yearsOfService > 5) {
            double bonus = 0.05 * salary; 
            System.out.println("Your bonus amount is: " + bonus);
        } else {
            System.out.println("Sorry, no bonus. You need more than 5 years of service.");
        }
        input.close(); 
    }
}

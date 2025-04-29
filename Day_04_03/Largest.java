import java.util.Scanner;
public class Largest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number1: ");
		int n1 = input.nextInt();
		System.out.print("Enter number2: ");
		int n2 = input.nextInt();
		System.out.print("Enter number3: ");
		int n3 = input.nextInt();
		System.out.println("Is the first number the largest? " + (n1 > n2 && n1 > n3));
		System.out.println("Is the second number the largest? " + (n2 > n1 && n2 > n3));
		System.out.println("Is the third number the largest? " + (n3 > n1 && n3 > n2));
		 
	}
}
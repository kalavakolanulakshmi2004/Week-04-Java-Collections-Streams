import java.util.Scanner;
public class FirstSmall{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number1: ");
		int n1 = input.nextInt();
		System.out.print("Enter number2: ");
		int n2 = input.nextInt();
		System.out.print("Enter number3: ");
		int n3 = input.nextInt();
		 if ((n1<n2) && (n1<n3)) {
            System.out.println("Is the first number the smallest? Yes");
			}
		else {
		System.out.println("Is the first number the smallest? No");
		}
			
        
	}
}
import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		int fact=1;
		if(n>=0){
			int i=1;
			while (i<=n){
			fact*=i;
			i++;
			}
			System.out.println("The factorial of "+n +" is:"+fact);
		}
		else if (n==0){
			System.out.println("The factorial of "+n+" is 1");
		}
		else{
		System.out.println("Please enter a valid positive integer.");
		}
	}
}
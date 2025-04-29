import java.util.Scanner;
public class Divbyfive{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = input.nextInt();
		 if (n % 5 == 0) {
            System.out.println("Is the number " + n + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + n + " divisible by 5? No");
        }
	}
}
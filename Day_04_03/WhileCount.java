import java.util.Scanner;
public class WhileCount{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter countdown value: ");
		int counter = input.nextInt();
		while (counter>=1){
			System.out.println(counter);
			counter--;
		}
	}
}
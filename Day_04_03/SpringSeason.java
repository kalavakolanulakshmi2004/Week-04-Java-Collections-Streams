 import java.util.Scanner;
public class SpringSeason{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter month(1 to 12): ");
		int month = input.nextInt();
		System.out.print("Enter day(1 to 31): ");
		int date = input.nextInt();
		boolean isSpring = false; 
        switch (month) {
            case 3:
                if (date >= 20 && date <= 31) 
                    isSpring = true;
                break;
            case 4:
                if (date >= 1 && date <= 30) 
                    isSpring = true;
                break;
            case 5:
                if (date >= 1 && date <= 31) 
                    isSpring = true;
                break;
            case 6:
                if (date >= 1 && date <= 20) 
                    isSpring = true;
                break;
            default:
                isSpring = false; 
        }
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
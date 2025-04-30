package Doc1;
import java.util.Scanner;
import java.util.regex.*;
public class EmailExtractor{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = sc.nextLine();
		String re = "\\b[A-Za-z0-9.%+-]+@[A-Za-z0-9.-]+\\.[A-za-z]{2,}\\b";
		Pattern pattern = Pattern.compile(re);
		Matcher matcher = pattern.matcher(text);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
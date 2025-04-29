import java.util.Scanner;
public class NaturalForLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n= input.nextInt();
		int sum1=0;
		int sum2=0;
		if (n>0){
		  for(int i=1;i<=n;i++){
		  sum1+=i;}
		  System.out.println(sum1);
		  sum2=n*(n+1)/2;
		  System.out.println(sum2);
		}
		else{
			System.out.println("The number "+n +" is not a natural number");
		}
		
		String result= (sum1==sum2)? "correct": "incorrect";
		System.out.println(result);
		
	}
}
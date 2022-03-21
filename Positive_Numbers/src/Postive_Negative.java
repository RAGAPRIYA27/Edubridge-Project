import java.util.Scanner;
public class Postive_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number you want to check:");
		n=s.nextInt();
		if(n>0)
		{
			System.out.println("Number is Positive");
		}
		else if(n<0)
		{
		System.out.println("Number is Negative");
		}
		}
}

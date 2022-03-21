import java.util.Scanner;
public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		int n=s.nextInt();
		while (n<0)
		{
		System.out.println("Enter positive number");
		n=s.nextInt();
		}
		for (int i=0;i<=10; i++)
		{
		System.out.println(n*i);
		}
	}

}


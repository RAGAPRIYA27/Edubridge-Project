import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome palindrome = new Palindrome();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = scanner.nextInt();
        palindrome.printpalindrome(n);
        scanner.close();
	}
	void printpalindrome(int n) {
		int r, sum = 0;
	  while (n > 0) {
	   r = n % 10; // getting remainder
	   sum = (sum * 10) + r;
	   n = n / 10;
	  }
	   System.out.println(sum);
}


	}



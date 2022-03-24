import java.util.Scanner;

public class Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number, integer, odd = 0, even = 0;
		System.out.println("Enter the numbers of integers ");
		number = scanner.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.println("integer " + i);
			integer = scanner.nextInt();
			if (integer % 2 != 0)
				odd = odd + integer;
			else
				even = even + integer;
		}
		System.out.println("Sum of odd : " + odd);
		System.out.println("Sum of even : " + even);
		scanner.close();
	}

	}



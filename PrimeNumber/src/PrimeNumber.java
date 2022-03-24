import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber prime = new PrimeNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = scanner.nextInt();
        prime.printprime(number);
        scanner.close();
	}
	void printprime(int number) {
		int i, m = 0, flag = 0;
		m = number / 2;
		if (number == 0 || number == 1) {
			System.out.println(number + " not a prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (number % i == 0) {
					System.out.println(number + " not a prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(number + " is a prime number");
			}
		}
	}


	}



import java.util.Scanner;
public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Multiple multiple = new Multiple();
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		multiple.getmultiple(number);
		scanner.close();
	}
		void getmultiple(int number) {

			if (number % 12 == 0)
				System.out.println("Number : " + number + " is Multiple of 12");
			else
				System.out.println("Number : " + number + " is Not Multiple of 12");
	

	
	}

}

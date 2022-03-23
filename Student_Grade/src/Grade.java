import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter percentage marks");
		double percentage = scan.nextDouble();

		if(percentage < 100 && percentage >= 90){
			System.out.println("Excellent");
		}else if(percentage < 90 && percentage >= 80){
			System.out.println("Good");
		}else if(percentage < 80 && percentage >= 60){
			System.out.println("Passed");
		
		}else {
			System.out.println("Failed");
		}
	}

}

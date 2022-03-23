import java.util.Scanner;

public class Powerofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Powerofnumbers powernumber = new Powerofnumbers();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number  and  Power : ");
		int number = scanner.nextInt();
		int power = scanner.nextInt();
		powernumber.printPower(number, power);
        scanner.close();
	}
	 void printPower(int number, int power) {
   	  int answer=1;
   	  for(int i=1;i<=power;i++) {
   		  answer =number * answer;
   	  }
   	 System.out.println(" Number :"+number+" Power :"+power+" = "+answer);
     }

	}



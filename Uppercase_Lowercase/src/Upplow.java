import java.util.Scanner;

public class Upplow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		if(ch >= 65 && ch <= 90)
			System.out.print("Upper");
		else if(ch >= 97 && ch <= 122)
			System.out.print("Lower");
		else if(ch >= 48 && ch <= 57)
			System.out.print("Number");
		
	}

}

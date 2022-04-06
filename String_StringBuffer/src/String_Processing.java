import java.util.Scanner;

public class String_Processing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		System.out.println("String : " + String_Processing.moveX(s));
		sc.close();
	}
	public static String moveX(String s) {
		String s1 = s.replaceAll("[x]", "");
		String s2 = s.replaceAll("[^x]", "");
		s1 += s2;
		return s1 ;
	}
	}



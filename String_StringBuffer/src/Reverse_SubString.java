import java.util.Scanner;

public class Reverse_SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the String :");
		String s1 = sc.nextLine();
		System.out.println("beginning index of Reverse string : ");
		int a = sc.nextInt();
		System.out.println("ending index of reverse string :");
		int b = sc.nextInt();
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse(); // Reverse function

		System.out.println("string : " + Reverse_SubString.reverseSubstring(sb, a, b));
		sc.close();
	}
	public static String reverseSubstring(StringBuffer sb, int a, int b) {
		StringBuffer sb1 = new StringBuffer();
		String ss = sb1.append(sb.substring(a, a + b)).toString(); 
		return ss;
	}
	}



import java.util.Scanner;

public class Flush_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s1 = sc.nextLine();
		String s2 = Flush_Character.getSpecialChar(s1);
		System.out.println("Special Character : " + s2);
		sc.close();
	}
	public static String getSpecialChar(String s1) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s1.length(); i++) {
			char a = s1.charAt(i);
			if (!Character.isAlphabetic(a))
				sb.append(a);
		}
		return sb.toString();
	}


	}



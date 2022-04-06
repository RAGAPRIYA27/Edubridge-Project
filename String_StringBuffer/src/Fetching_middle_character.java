import java.util.Scanner;

public class Fetching_middle_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String s = sc.next();
		String str = Fetching_middle_character.getMiddleChars(s);//function call
		System.out.println("A Middle Character : " + str);
		sc.close();
	}
	public static String getMiddleChars(String s) {
		StringBuffer sb = new StringBuffer();
		String s2 = null;
		if (s.length() % 2 == 0) {
			sb.append(s.substring(s.length() / 2 - 1, s.length() / 2 + 1));//Training 
		}
		s2 = sb.toString();
		return s2;
	}


	}



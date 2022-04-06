import java.util.Scanner;

public class Playing_with_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the NO.Of strings in an Aaray : ");
		int n = Integer.parseInt(in.nextLine());
		String s1[] = new String[n];

		for (int i = 0; i < n; i++) { 
			System.out.println("Enter String " + (i + 1) + " : ");
			s1[i] = in.nextLine();
		}
		int a = Integer.parseInt(in.nextLine());
		System.out.println("String : " + Playing_with_String.formString(s1, n, a));
		in.close();
	}
	public static String formString(String s1[], int n, int a) { 
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			if (s1[i].length() >= a) 
				sb.append(s1[i].substring(a - 1, a));
			else
				sb.append("$");
		}
		return sb.toString();
	}


	}



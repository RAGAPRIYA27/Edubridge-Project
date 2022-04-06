import java.util.Scanner;

public class Replication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
	    String s=sc.next();
	    System.out.println("Enter the NO.Of times to print a String");
	    int n=sc.nextInt();
	    String s2=Replication.repeatString(s,n);
	    System.out.println("Repilcation String : "+s2);
	    sc.close();
	}
	public static String repeatString(String s,int n){

	    StringBuffer sb=new StringBuffer();
	    for(int i=0;i<n;i++)
	    {
	      sb.append(s);
	    }

	    return sb.toString();
	}

}
	


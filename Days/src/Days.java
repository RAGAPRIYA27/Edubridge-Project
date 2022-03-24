import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Days days = new Days();
		String day;
		System.out.println("Enter the Day : ");
		day = scanner.next();
		days.getResult(day);
		scanner.close();		
	}
	void getResult(String day) {
		switch(day) {
		case "Monday":
		case "MONDAY":
			System.out.println("First day of the Week");
			break;
		case "Tuesday":
		case "TUESDAY":
			System.out.println("Second day of the Week");
			break;
		case "Wednesday":
		case "WEDNESDAY":
			System.out.println("Mid day of the Week");
			break;
		case "Thursday":
		case "THURSDAY":
			System.out.println("Mid day of the Week");
			break;
		case "Friday":
		case "FRIDAY":
			System.out.println("Last working day");
			break;
		case "Saturday":
		case "SATURDAY":
			System.out.println("Week end");
			break;
		case "Sunday":
		case "SUNDAY":
			System.out.println("Week end");
			break;

		}
	}



	}



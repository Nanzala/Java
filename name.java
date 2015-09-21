import java.util.Scanner;

public class name{

	/*
	public static String sayMyName(String firstName, String middleName, String lastName){
		String name1 = firstName + middleName + lastName;
		System.out.println("Your name is: " + firstName + " " + middleName + " " + lastName + ".");
		return name1;
	}

	public static void sayMyName(String firstName, String lastName){
		String name2 = sayMyName(firstName, " ", lastName);
		// System.out.println("Your name2 is: " + name2 + ".");
	}

	public static void sayMyName(String	fullName){
		String name3 = sayMyName(fullName, "", "");
		// System.out.println("Your name3 is: " + name3 + ".");
	}

	public static void main (String args[]){

		sayMyName("Tabitha","Nanzala","Mayabi");
		sayMyName("Tabitha","Mayabi");
		sayMyName("Tabitha Nanzala Mayabi");
		
	}
	*/

	

	public static String getFirstName(){
		System.out.println("Enter your first name: ");
		Scanner in = new Scanner(System.in);
		String firstName = in.nextLine();
		return firstName;

	}
	public static String getMiddleName(){
		System.out.println("Enter your middle name: ");
		Scanner in = new Scanner(System.in);
		String middleName = in.nextLine();
		return middleName;
	}
	public static String getLastName(){
		System.out.println("Enter your last name: ");
		Scanner in = new Scanner(System.in);
		String lastName = in.nextLine();
		return lastName;
	}
	public static void sayMyName(String firstName, String middleName, String lastName){
		String name = firstName + middleName + lastName;
		System.out.println("Your name is: " + firstName + " " + middleName + " " + lastName + ".");
	}
	public static void main(String args[]){
		// String f = getFirstName();
		// String m = getMiddleName();
		// String l = getLastName();
		sayMyName(getFirstName(),getMiddleName(),getLastName());

	}

}


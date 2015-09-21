import java.util.Scanner;

public class Methods{
	
	public static void sayMyName(){
	
		/*
		System.out.println("Enter your name: ");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		System.out.println("Your name is: " + name + ".");
		*/

		System.out.println("Enter your name: ");
		Scanner in = new Scanner(System.in);
		System.out.println("Your name is: " + in.nextLine() + ".");
	}

	public static void sayMyAge(){

		/*
		System.out.println("Enter your age: ");
		Scanner in = new Scanner(System.in);
		int age = Integer.parseInt(in.nextLine());
		System.out.println("Your age is: " + age + " yrs old.");
		*/

		System.out.println("Enter your age: ");
		Scanner in = new Scanner(System.in);
		System.out.println("Your age is: " + in.nextInt() + " yrs old.");
	}


	public static void addTwoNumbers(){

		Scanner in = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = in.nextInt();

		System.out.println("Enter second number: ");
		int num2 = in.nextInt();

		int sum = num1 + num2;
		System.out.println("Sum is: " + sum);

	}

	public static void multiplyTwoNumbers(){

		Scanner in = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = in.nextInt();

		System.out.println("Enter second number: ");
		int num2 = in.nextInt();

		int product = num1 * num2;
		System.out.println("Product is: " + product);

	}


	public static void main (String args[]){
		sayMyName();
		sayMyAge();
		addTwoNumbers();
		multiplyTwoNumbers();





	}
}
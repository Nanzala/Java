import java.util.Scanner;

class AddNumbers {
	public	static	void main(String args[]){
		
		int	num1, num2, result;

		Scanner in = new Scanner(System.in)

		System.out.println("Enter first number: ");
		num1 = Integer.parseInt(in.nextLine());

		System.out.println("Enter second number: ");
		num2 = Integer.parseInt(in.nextLine());

		result =num1 + num2;
		System.out.println("Sum of entered integers = " + result);

	}
}
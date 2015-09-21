import java.util.Scanner;


class AddNumbersLoop {
	public	static	void main(String args[]){

		/*
		int counter = 1, numEntered, result = 0;
		Scanner in = new Scanner(System.in);

		while (counter <= 10){
			System.out.println("Enter number: " + counter);
			numEntered = Integer.parseInt(in.nextLine());

			result += numEntered; // this is equivalent to result = result + numEntered
			counter++;
		}

		System.out.println("Sum of entered integers = " + result);
		*/

		int numEntered, result = 0;
		Scanner in = new Scanner(System.in);

		for(int counter=1; counter<=10; counter++){
			System.out.println("Enter number: " + counter);
			numEntered = Integer.parseInt(in.nextLine());

			result += numEntered; // this is equivalent to result = result + numEntered
		}
				
		System.out.println("Sum of entered integers = " + result);
	}
}
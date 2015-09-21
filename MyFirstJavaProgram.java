public class MyFirstJavaProgram {
	/* This is my first Java Program 
	 * It will print out 'Hello World' as the output
	*/

	public static void main(String []args) {
		/*System.out.println("Hello World"); // prints Hello World */
		
		/*
		byte b1, b2, b3, b4, b5;
		short s1, s2, s3, s4, s5;
		int num1, num2, num3, num4, num5;
		long l1, l2, l3, l4, l5;
		float f1, f2, f3, f4, f5;
		double d1, d2, d3, d4, d5; 
		char c1, c2, c3, c4, c5;
		boolean a, b, c, d, e;
		*/

		/*
		 int age = 100.23;
		int anotherInteger = -342584357908435722394854320;
		*/

		/*
		int a = 12;
		int b = -2;
		int c = 98;
		int d = 1005;
		int e = -2013;
		*/
		
		/*
		int age = 10;
		int classNumber = 31;
		float averageHeight = 1.26;
		System.out.println(age);
		System.out.println(classNumber);
		System.out.println(averageHeight);
		*/

		/*
		int numberOfClassesAtMEST = 2;
		int totalNumberOfStudentsPerClass = 31;

		int totalNumberOfStudentsAtMEST;

		totalNumberOfStudentsAtMEST = numberOfClassesAtMEST * totalNumberOfStudentsPerClass;

		System.out.println("MEST Students: " + totalNumberOfStudentsAtMEST);
		*/

		/*
		int age1 = 10;
		int age2 = 30;
		int age3 = 15;
		int age4 = 7;

		int sum = age1 + age2 + age3 + age4;
		int ave = sum/4;

		System.out.println(ave);
		*/

		
		/*
		int no1 = 12;
		int no5 = 342;
		int no6 = 54;
		int no7 = 67;
		float no2 = 13.43f;
		float no3 = 56.77f;
		float no4 = -911.2f;

		float sum = no1 + no2 + no3 + no4 + no5 + no6 +no7;
		float ave = sum/7;

		// System.out.println("Average: " + ave); 

		System.out.print("Average: "); 
		System.out.println(ave); 
		
		String name;
		name = "My name is Tabby. I'm me.";

		System.out.println(name);
		*/

		/*
		String name = "Tabby";
		int age = 26;
		String nationality = "Kenyan";
		float height = 1.65f;
		String favoriteFood = "Kuku choma";
		String favoriteGame = "Mahjong";

		System.out.println("My name is " + name + ".");
		System.out.println("I am " + age + " yrs old.");
		System.out.println("I am " + nationality + ".");
		System.out.println("I am " + height + " tall.");
		System.out.println("My favourite food is " + favoriteFood + ".");
		System.out.println("My favourite game is " + favoriteGame + ".");
		*/

		int VOTING_AGE =18;

		int age1 = 10;
		int age2 = 20;


		if (age1 <= VOTING_AGE) {
		System.out.println("You are not old enough to vote.");	
		}
		else {
		System.out.println("Getting your Voter's Card in a second.");
		}

		if (age1 < VOTING_AGE) {
		String message = "You are not old enough to vote.";	
		}
		else {
		String message = "Getting your Voter's Card in a second.";
		}

		System.out.println(message);

	} 
}
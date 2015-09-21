public class Arrays{

	/*public static void add(double[] array){
		
		double total = 0.0;
		for (int i=0; i<array.length; i++){
			total += array[i];
		}

		System.out.println("Total is: " + total);
	}
	
	public static void main (String args[]){
		double[] num = {1.2,3.4,5.6,7.8, 9.01};
		add(num);
	}
	*/
	
	public static void main (String args[]){
		
		String [][] names = {
			{"Mr.", "Mrs.", "Ms."},
			{"Smith", "Jones"}
		};
		
		for(int i=0; i<names[0].length; i++){
			for(int j=0; j<names[1].length; j++){
				System.out.println("i is:" + i + " & " + "j is:" + j);
				System.out.println(names[0][i] + names[1][j]);
			}
		};
	}

}
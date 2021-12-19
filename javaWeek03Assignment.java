package javaWeek03Assignment;

public class javaWeek03Assignment {

	public static void main(String[] args) {
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 105};
		
		System.out.println("The first value subtracted from the last value is: " + firstMinusLast(ages));
		System.out.println("The average age is: " + arrayAverager(ages));
		System.out.println("");
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		System.out.println("The average number of letters is: " + averageNumberOfLetters(names));
		System.out.println("All the names on a line look like: " + nameCater(names));
		
	}
	
	static int firstMinusLast(int[] x) {
		//Takes the array length (which is the last item in the array) and subtracts it from the 1st item. "0"
		return (x[x.length - 1] - x[0] );
	}
	
	static int arrayAverager(int[] y) {
		int arrayLength = y.length;
		int sum = 0;
		
		for ( int i = 0; i < arrayLength; i++ ) {
			sum += y[i];
		}
		
		return sum / arrayLength;
		
	}

	static int averageNumberOfLetters(String[] z) {
		int letterTotal = 0;
		
		for( int i = 0; i < z.length; i ++) {
			letterTotal += z[i].length();
		}
		
		return (letterTotal / (z.length - 1));
	}
	
	static String nameCater(String[] names) {
		String nameCatepillar = "";
		
		for( int i = 0; i < names.length; i ++) {
			nameCatepillar += names[i] + " ";
		}
		
		return nameCatepillar;
	}


}
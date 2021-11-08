package ex;

public class ArrayEx1 {

	public static void main(String[] args) {

		int a[]; // defining array
		a = new int[3]; // defining size of array

		// assigning value in array
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		// a[3]=40; //Assign yhe value to element more than length of array show run
		// time error
		// Run time error ArrayIndexOutOfBoundsException

		// assign invalid data type give syntax error
		// a[2]=1.40; //syntax eroor Invalid datatype

		// int b=a[1];
		System.out.println();

		// 2nd method to define array

		// declare array with size

		int aa[] = new int[3];

		aa[0] = 100;
		aa[1] = 200;
		aa[2] = 300;
		// System.out.println(aa[0]+aa[1]);

		// 3rd method to define array
		// declare Array , assign value with size
		// dataType [] arrayName= {value1, value2, value3};

		int[] aaa = { 10, 20, 30, 30 };

		// System.out.println(aaa[2]+aaa[3]);

//------------------------------------------------------------------------------------------------------------------------

		// Declaring different types of Array

		char[] charArray = { 'A', 'B', 'C' };

		int[] intArray = { 10, 20, 30, 25 };

		String[] stringArray = { "sagar", "swapnil", "vaibhav" };

		boolean[] booleanArray = { true, false, true, true };

		double[] doubletypeArray = { 1.234, 2.45, 3.45 }; // Array of decimal pont value

		// System.out.println(charArray[2]); //C

		// copy value from one array to another array

		int[] a1 = { 1, 2, 3, 4, 5 };

		int[] a2 = a1;

		// System.out.println(a2.length);

		for (int i = 0; i < a2.length; i++) {

			// System.out.println(a1[i]);
			// System.out.println(a2[i]);
		}

		// Types of Array

		// 1. single dimensional Array like above all

		// 2. multi dimensional Array

		int[][] aa2 = { { 1, 3, 5 }, { 2, 4, 6 } };

		// System.out.println(aa2[0][0]);

		// System.out.println(aa2[1][0]);

		for (int i = 0; i < aa2.length; i++) {

			for (int j = 0; j <= aa2.length; j++) {

				System.out.print(aa2[i][j] + "  ");

			}

			System.out.println();
		}

	}

}


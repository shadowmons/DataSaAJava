package dataSaA;

import java.util.Arrays;

public class ArraysTest {

	public ArraysTest() {
		// Declaring Array
		int[] numbers = new int[9];
		System.out.println(Arrays.toString(numbers));
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i * i;
		}
		System.out.println(Arrays.toString(numbers));

		float[] decimals = { 3.4f, 3.4f, 5.6f, 5, 5.3f, 5.6f, 8.5f };
		System.out.println(Arrays.toString(decimals));
		Arrays.sort(decimals);
		//Sorting Arrays
		System.out.println(Arrays.toString(decimals));

		// Print Arrays. String is an object
		String[] colors = new String[5];
		colors[0] = "blue";
		colors[1] = "red";
		System.out.println("The length of the array is " + colors.length);

		System.out.println(colors);
		System.out.println(Arrays.toString(colors));

		PrintArray(colors);
		Arrays.stream(colors).forEach(System.out::println);

		// Copy Arrays an change their length
		int[] number2 = Arrays.copyOf(numbers, 10);
		System.out.println(Arrays.toString(number2));
		
		TwoD();
	}

	public void PrintArray(Object[] array) {
		for (Object lines : array) {
			System.out.println(lines);
		}

	}

	public void PrintArrayOneLine(Object[] array) {
		System.out.println(Arrays.toString(array));

	}

	public void TwoD() {
		char[][] board = new char[4][3];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = '-';

			}

		}
		
		char[][] board2= new char [][] {
			new char[]{'x','x','x'},
			new char[]{'x','x','x'},
			new char[]{'x','x','x'},
		};
		PrintArrayOneLine(board);
		System.out.println(Arrays.deepToString(board));
		System.out.println(Arrays.deepToString(board2));
		
		
		int[][] binario = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		System.out.println(Arrays.deepToString(binario));

	}
}

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
	//Iwant to show the sum, product and average of the items of an array
	public void CalculusArray(int[] array) {
		int suma = 0;
		int mult = 1;
		float average = 0;
		for(int number:array) {
			suma += number;
			mult *= number;			
		}
		average = (float)suma/array.length;
		System.out.println("the array is: " + Arrays.toString(array));
		System.out.println("The sum of the elements is: " + suma);
		System.out.println("The product of all elements is: " + mult);
		System.out.println("The average of the elements is " + average);
	}
	
	//Write a program that displays the number of occurences of an element in the array
	public void OccurrencesArray(int[] array, int number) {
		int cont = 0;
		for(int caracter:array) {
			if(caracter ==number) {
				cont+=1;
			}
		}
		System.out.println("the array is: " + Arrays.toString(array));
		System.out.println("the number " + number + " appear: " + cont + " times");
	}
	
	//write a program that places the odd elements of an array before the even elements
	public void SortingOddArray(int[] array) {
		int[] copy = new int[array.length];
		int cont = 0;
		int size = copy.length-1;
		for (int i = 0; i < copy.length; i++) {
			if(array[i] % 2 !=0) {
				copy[cont]=array[i];
				cont++;
			}else {
				copy[size-i+cont]=array[i];
			}
		}
		System.out.println(Arrays.toString(copy));
		
		
		
	}
	
}

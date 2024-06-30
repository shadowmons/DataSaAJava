package dataSaA;

import java.util.*;

public class ListTest {
	
	public void UnmutableListTest() {
		List <String> Datos = List.of (
			"Name","LastName","Citizenshi"
		);
		System.out.println(Datos);
		System.out.println(Datos.get(1));
		
	}
	
	public void ArrayListTest() {
		//Generic list
		List<String> colors = new ArrayList<>();
		colors.add("blue");
		colors.add("red");
		System.out.println(colors.size());
		System.out.println(colors.contains("red"));
		System.out.println(colors);
		
		
		colors.forEach(System.out::println);
		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
			
		}
		//ArrayList dont work with primitive  types
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(24);
		//Insert in the index indicated
		integers.add(0,3);
		System.out.println(integers);
		System.out.println(integers.get(2));
		System.out.println("size of the array is " + integers.size());
		integers.set(1, 12);
		System.out.println(integers);
		//Removing could be by index or by value, in string is better
		integers.remove(0);
		//Clear is used to empty the array
		integers.clear();
		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("blackberry");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("coconut");
		fruits.add("apple");
		fruits.add("mango");
		System.out.println(fruits);
		fruits.sort(null);
		System.out.println(fruits);
		
		integers.add(1);
		integers.add(5);
		integers.add(1);
		integers.add(6);
		integers.add(4);
		integers.add(264);
		integers.add(19);
		integers.add(11);
		integers.add(1);
		integers.add(6);
		System.out.println(integers);
		SortRemoveArray(integers);
		System.out.println(integers);
		
	}
	
	//Remove the repeated elements and sort the array
	public void SortRemoveArray(ArrayList<Integer> array) {
		array.sort(null);
		ArrayList<Integer> newArray = new ArrayList<>();
		for (Integer element : array) {
			if(!newArray.contains(element)) {
				newArray.add(element);
			}
		}
		array.clear();
		array.addAll(newArray);
	}
	
	public void ArrayListMultiD() {
		ArrayList <ArrayList<Double>> matrix =  new ArrayList<>();
		
 	}
	
	public void InteractiveArray() {
		List<String> elements = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int choice;
		boolean flag = true;
		
		while(flag) {
			DisplayMenu();
			choice = input.nextInt();
			
			switch(choice) {
			  case 1: 
				  System.out.println("Write what you want to add to the array, could be anything");
				  elements.add(input.next());
				  break;
			  case 2: 
				  if (elements.size()>0) {elements.remove(0);}
				  break;
			  case 3:
				  System.out.println(elements);
				  break;
			  case 4:
				  flag=false;
				  break;
				  default:
					  break;
				  
			
			
			}
		
			
			
		}
		
		
	}
	
	public static void DisplayMenu(){
		System.out.println("Press 1 to add an element: ");
		System.out.println("Press 2 to remove the first element: ");
		System.out.println("Press 3 to display all elements: ");
		System.out.println("Press 4 to exit");
		
	}

}

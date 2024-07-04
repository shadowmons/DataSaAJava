package dataSaA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

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
	
	//Stack is last in first out(LIFO) it extends class vector
	public void StackTest() {
		Stack<Integer> stack = new Stack<>();
		//To add values
		stack.push(1);
		stack.push(3);
		stack.push(2);
		//To check the content
		System.out.println(stack);
		System.out.println(stack.size());
		//To check the last element
		System.out.println(stack.peek());
		//To eliminate the last element
		System.out.println(stack.pop());
		System.out.println(stack.empty());
				
	}
	
	public void QueueTest() {
		//first in first out (FIFO)
		Queue<Person> supermarket = new LinkedList<>();
		supermarket.add(new Person("alex",21));
		supermarket.add(new Person("juan", 43));
		supermarket.add(new Person("Amy",27));
		//Check the first person in the queue
		System.out.println(supermarket.peek());
		//To eliminate the first element
		System.out.println(supermarket.poll());
		System.out.println(supermarket.size());
		System.out.println(supermarket);
	}
	
	static record Person(String name, int age) {}
	
	//Each node contend reference for the previous and next node
	//the head is the first, and the the tail referencest to null
	//The references take memory
	public void LinkListTest() {
		LinkedList <Person> LL = new LinkedList<>();
		LL.add(new Person("alex",21));
		LL.add(new Person("juan", 43));
		LL.add(new Person("Amy",27));
		LL.forEach(System.out::println);
		ListIterator<Person> PersonIterator = LL.listIterator();
		while(PersonIterator.hasNext()) {
			System.out.println(PersonIterator.next());
		}
		while(PersonIterator.hasPrevious()){
			System.out.println(PersonIterator.previous());
		}
		System.out.println(LL.get(0));
		LL.add(2, new Person("Abel",27));
		System.out.println(LL);		
		
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
			choice = input.nextInt();switch(choice) {
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
		input.close();
	}
	
	public static void DisplayMenu(){
		System.out.println("Press 1 to add an element: ");
		System.out.println("Press 2 to remove the first element: ");
		System.out.println("Press 3 to display all elements: ");
		System.out.println("Press 4 to exit");
		
	}

}

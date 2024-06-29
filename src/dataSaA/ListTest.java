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
	
		
		
		
	}
	
	public void ArrayListMultiD() {
		ArrayList <ArrayList<Double>> matrix =  new ArrayList<>();
		
 	}

}

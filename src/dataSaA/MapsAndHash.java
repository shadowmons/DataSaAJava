package dataSaA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class MapsAndHash {
	
	
	//A collection that contains no duplicate elements
		//Set does not guarantee order unlike list
		public void SetsTest() {
			Set<Ball> balls = new HashSet<>();
			balls.add(new Ball("blue"));
			balls.add(new Ball("red"));
			balls.add(new Ball("yellow"));
			balls.add(new Ball("white"));
			balls.add(new Ball("red"));
			balls.remove(new Ball("red"));
			//There is not "Get" cause you cannot define wich element to collect
			//Imagine a bag of balls, if you put your hand inside is whatever you get
			balls.forEach(System.out::println);
			System.out.println(balls.isEmpty());
			System.out.println(balls);
			//Transforming to Array
			Object[] ballss =  balls.toArray();
			System.out.println(ballss[0]);
			System.out.println(Arrays.toString(ballss));
		}

		//static record Ball(String Color) {}
		//If you want to use class with sets, need to override the equals method
		static class Ball{
			String color;
			public Ball(String color) {
				this.color=color;
			}
			
			@Override
			public boolean equals(Object obj) {
				if (this== obj)return true;
				if(obj==null || getClass()!= obj.getClass())return false;
				Ball ball = (Ball) obj;
				return Objects.equals(color,ball.color);
			}
			
			@Override
			public int hashCode() {
				// TODO Auto-generated method stub
				return Objects.hash();
			}
			
			@Override
			public String toString() {
				return "Ball Color: " + color;				
			}
			
		}
		
		//A Map cannot contain duplicate keys
		//Each key can map to at most one value
		public void MapsTest() {
			Map<Integer,Person> map = new HashMap<>();
			map.put(1, new Person("Alex"));
			map.put(2, new Person("Amy"));
			map.put(3, new Person("jose"));
			//The last entry with the same key will override the value
			map.put(3, new Person("Joshua"));
			System.out.println(map);
			System.out.println(map.size());
			System.out.println(map.get(1));
			System.out.println(map.containsKey(4));
			System.out.println(map.keySet());
			System.out.println(map.entrySet());
			map.remove(3);
			//Print like javaScript
			map.entrySet().forEach( x -> System.out.println(x.getKey() + " " + 
			x.getValue()));
			map.forEach((keyVariable, person) ->{
				System.out.println(keyVariable + " " + person);
			});
			//Clar everything from the map
			map.clear();
			map.put(1, new Person("Alex"));
			map.put(2, new Person("Amy"));
			map.put(3, new Person("jose"));
			System.out.println(map.values());
			
		}
		//Again, the HashCode is unique, so even if a class has the same atribute value
		//Doesnt guarantee that is going to be consider the same object(equiality)
		//for this we gotta override the equals and hashcode methods
		//This is for objects
		static class Person {
			String name;
			
			public Person(String name) {
				this.name=name;
			}
			
			@Override
			public boolean equals(Object obj) {
				if (this== obj)return true;
				if(obj==null || getClass()!= obj.getClass())return false;
				Person person = (Person) obj;
				return Objects.equals(name,person.name);
			}
			
			@Override
			public int hashCode() {
				// TODO Auto-generated method stub
				return Objects.hash(name);
			}
			
			@Override
			public String toString() {
				return "Person name is : " + name;				
			}
			
		}
		static record Diamond(double size) {}
		
		public void HashMapsCodes() {
			Map<Person,Diamond>map = new HashMap<>();
			map.put(new Person("Juan"), new Diamond(0.9));
			map.put(new Person("Amy"), new Diamond(3.5));
			map.put(new Person("Joshua"), new Diamond(1.5));
			map.put(new Person("Joshua"), new Diamond(3.5));
			System.out.println(new Person("Joshua").hashCode());
			System.out.println(new Person("Joshua").hashCode());
			System.out.println(new Person("Amy").hashCode());
			System.out.println(map);
			System.out.println(map.values());
			System.out.println(map.keySet());
		}

}
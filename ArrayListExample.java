package sorted;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>();
		List<String> obj2 = new ArrayList<String>();
		
		obj.add("Georgia");
		System.out.println(obj);
		obj.add("Harry");
		System.out.println(obj);
		obj.add("Becky");
		System.out.println(obj);
		obj.add("Liberty");
		System.out.println(obj);
		obj.add("Lucas");
		System.out.println(obj);
		obj.add("Jason");
		
		obj2.add("Ham");
		System.out.println(obj2);
		obj2.add("Cheese");
		System.out.println(obj2);
		obj2.add("Pineapple");
		System.out.println(obj2);
		obj2.add("Bread");
		System.out.println(obj2);
		obj2.add("Egg");
		System.out.println(obj2);
		
		System.out.println("Currently the array list has the following elements:" + obj);
		
		obj.add(0, "Luke");
		System.out.println(obj);
		obj.add(1, "James");
		System.out.println(obj);
		obj.add(1,  "Kevin");
		System.out.println(obj);
		obj.add(1, "J-Lo");
		System.out.println(obj);
		obj.add(1, "Arun");
		System.out.println(obj);
		
		obj.remove("Becky");
		System.out.println(obj);
		obj.remove("Harry");
		System.out.println("Current array list is:" + obj);
		System.out.println(((ArrayList<String>) obj).size());
		
		obj.addAll(obj2);
		System.out.println(obj);		
	}
}

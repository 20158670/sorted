package sorted;

import java.util.ArrayList;
import java.util.List;

public class markLength4 {

	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>();

		obj.add("This");
		obj.add("is");
		obj.add("lots");
		obj.add("of");
		obj.add("fun");
		obj.add("for");
		obj.add("a");
		obj.add("Java");
		obj.add("Programmer");
		String temp1 = null;
		
		List<String> newObj = new ArrayList<String>();
		
		for(int i = 0; i<obj.size(); i++){
			temp1 = obj.get(i);
			if(temp1.length()%4 == 0){
				newObj.add("****");
			}
			newObj.add(temp1);
		}
		System.out.println(obj);
		System.out.println(newObj);
	}

}

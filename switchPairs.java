package sorted;

import java.util.ArrayList;
import java.util.List;

public class switchPairs {

	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>();
		
		obj.add("N1");
		obj.add("N2");
		obj.add("N3");
		obj.add("N4");
		obj.add("N5");
		obj.add("N6");
		obj.add("N7");
		String temp1 = null;
		System.out.println(obj);		
		for(int i = 0; i<obj.size(); i++){
			if(i%2 != 0){
				temp1 = obj.get(i-1);
				obj.set(i-1, obj.get(i));
				obj.set(i, temp1);
			}
		}
		System.out.println(obj);
		
	}

}

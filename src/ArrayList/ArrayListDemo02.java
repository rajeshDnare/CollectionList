package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo02 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(5);
		a.add(10);
		System.out.println(a);
		
		Iterator i=a.iterator();
		while(i.hasNext()) {
			Object d=i.next();
			System.out.println(d);
			
		}
		
		System.out.println(a);
		
	

	}

}

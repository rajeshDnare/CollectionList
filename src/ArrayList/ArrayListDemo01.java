package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo01 {

	public static void main(String[] args) {
		
		ArrayList names=new ArrayList();
		
		names.add("Riyansh");
		names.add("Vaishnav");
		names.add("Vedant");
		names.add("Rajesh");
		names.add("Ankita");
		names.add(null);
		
		
		System.out.println(names);
		System.out.println(names.get(2));
		System.out.println(names.set(2, "Nare"));
		System.out.println(names);
		System.out.println(names.size());
		
		
		
		

	}

}

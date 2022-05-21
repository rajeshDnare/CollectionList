package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListComparable_01 {
	public static void main(String[] args) {
		ArrayListComparable a=new ArrayListComparable("rajesh");
		ArrayListComparable b=new ArrayListComparable("ankita");
		ArrayListComparable c=new ArrayListComparable("vedant");
		ArrayListComparable d=new ArrayListComparable("riyansh");
		ArrayListComparable e=new ArrayListComparable("vaishnav");
		ArrayListComparable f=new ArrayListComparable("mammi");
		ArrayListComparable g=new ArrayListComparable("pappa");
		
		ArrayList<ArrayListComparable> al=new ArrayList<>();
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		al.add(e);
		al.add(f);
		al.add(g);
		
		Collections.sort(al);
		
		Iterator<ArrayListComparable> itr=al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next().s);
		
		
		
	}

}

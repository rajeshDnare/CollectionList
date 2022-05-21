package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo03 {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList();
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(0);
		a.add(0);
		a.add(0);
		List<Integer> b=new ArrayList();
		b.add(0);
		b.add(1);
		b.add(0);
		b.add(0);
		b.add(0);
		b.add(0);
		List<Integer> c=new ArrayList();
		c.add(1);
		c.add(1);
		c.add(1);
		c.add(0);
		c.add(0);
		c.add(0);
		List<Integer> d=new ArrayList();
		d.add(0);
		d.add(0);
		d.add(2);
		d.add(4);
		d.add(4);
		d.add(0);
		List<Integer> e=new ArrayList();
		e.add(0);
		e.add(0);
		e.add(0);
		e.add(2);
		e.add(0);
		e.add(0);
		List<Integer> f=new ArrayList();
		f.add(0);
		f.add(0);
		f.add(1);
		f.add(2);
		f.add(4);
		f.add(0);
		List<List<Integer>> arr = new ArrayList<>();
		arr.add(a);
		arr.add(b);
		arr.add(c);
		arr.add(d);
		arr.add(e);
		arr.add(f);
		
		Iterator<List<Integer>> itr1=arr.iterator();
//		while(itr1.hasNext()) {
//			System.out.println(itr1.next());
//		}
		
		int hg=0;
		for (int i = 0; i < (arr.size()-2); i++) {
			for (int j = 0; j < (arr.get(i).size()-2); j++) {
				int Add=(arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2));
				if(Add>hg) {
					hg=Add;
				}
			}
			
		}
		System.out.println(hg);
		
		
		
		

	}

}

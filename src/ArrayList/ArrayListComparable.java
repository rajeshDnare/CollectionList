package ArrayList;

public class ArrayListComparable implements Comparable<ArrayListComparable>{
	String s;
	
	public ArrayListComparable(String s) {
		// TODO Auto-generated constructor stub
		this.s=s;
	}

	@Override
	public int compareTo(ArrayListComparable o) {
		// TODO Auto-generated method stub
		return -(this.s.compareTo(o.s));
	}

	

}

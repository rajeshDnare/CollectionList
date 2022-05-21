package stack;

import java.util.Stack;

public class StackDemo01 {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(12);							//push
		s.push(14);
		s.push(16);
		s.push(18);
		s.push(20);
		s.push(22);
		
		System.out.println(s);
		
		Object s1=s.pop();
		System.out.println(s1);
		
//		Object s2=s.peek();					//peek
//		System.out.println(s2);
//		System.out.println(s);
		
//		boolean s3=s.empty();				//empty
//		System.out.println(s3);
		
//		int s4=s.search(18);				//empty
//		System.out.println(s4);
		
		
		
	}

}

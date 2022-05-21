//program to check if a string is a palindrome or not
package stack;

import java.io.*;
import java.util.*;

public class StackQueue {
    // Write your code here.
    Stack<Character> s=new Stack<Character>();
    static Queue<Character> q=new ArrayDeque<Character>();
    public void pushCharacter(char c){
        s.push(c);
    }
    public void enqueueCharacter(char c){
        q.add(c);
    }
    public char popCharacter(){
        return s.pop();
    }
    public char dequeueCharacter(){
        return q.poll();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string");
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();
//        System.out.println(s[1]);

        // Create a Solution object:
        StackQueue p = new StackQueue();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }
        

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
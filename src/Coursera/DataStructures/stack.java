package Coursera.DataStructures;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(32);
        stk.push(23);
        stk.push(64);
        stk.push(34);
        stk.push(87);
        System.out.println(stk);
        int pop = stk.pop();
        System.out.println(pop);
        int peek = stk.peek();
        System.out.println(peek);
        int index = stk.search(64);
        System.out.println(index); //indexing starts at 1
        System.out.println(stk.size());
        System.out.println(stk.empty());
        System.out.println(stk);
    }
}

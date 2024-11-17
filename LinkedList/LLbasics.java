package LinkedList;

import java.util.*;

public class LLbasics
{
    public static void main(String[] args) {
        LinkedList<String> car= new LinkedList<String>();
        car.add("Alto");
        car.add("BMW");
        car.add("TATA");
        System.out.println(car);
        car.addFirst("45");
        System.out.println(car);

        Vector v1=new Vector();
        v1.add(34);
        System.out.println(v1);
        v1.addAll(car);
        System.out.println(v1);
        v1.remove(2);
        System.out.println(v1);

        Deque<Integer> deque=new ArrayDeque<Integer>();
        deque.add(23);
        deque.add(12);
        deque.add(5);
        deque.add(87);
        deque.add(7);
        System.out.println(deque);
        int x=deque.peek();
        System.out.println(x);
        deque.pollLast();
        System.out.println(deque);

        Stack<String> s1=new Stack<String>();
        s1.push("45");
        s1.push("23");
        s1.push("888");
        System.out.println(s1);
        String r=s1.peek();
        System.out.println(r);
        s1.pop();
        System.out.println(s1);
    }
}

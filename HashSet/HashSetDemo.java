package HashSet;

import java.util.HashSet;

class Student1 implements Comparable
{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class HashSetDemo {
    public static void main(String[] args)
    {
        HashSet set = new HashSet();
        set.add(34);
        set.add(31);
        set.add(34);
        set.add(23);
        set.add(798);
        System.out.println(set);
        HashSet set1 = new HashSet();
        set1.add(56);
        set1.add(32);
        set1.add(34);
        set1.add(31);
        System.out.println(set1);
        set1.addAll(set);
        System.out.println(set1);
//		set.contains(34);
        System.out.println(set.contains(34));
    }
}

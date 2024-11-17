package Generics;

interface Iface<K> {
    K getFirst();
    K getLast();
}
class Test2<K> implements Iface<K> {
    K k[];
    public Test2(K k[]) {
        this.k = k;
    }
    public K getFirst() {
        return k[0];
    }
    public K getLast() {
        return k[k.length - 1];
    }
}

public class genericInterface {
    public static void main(String[] args) {
        Integer all[] = {1,2,3,4,6};
        Test2<Integer> t = new Test2<Integer>(all);
        System.out.println(t.getFirst());
        System.out.println(t.getLast());

        Float fall[] = {1.5f, 2.4f, 3.6f, 4.5f, 6.4f};
        Test2<Float> f = new Test2<Float>(fall);
        System.out.println(f.getFirst());
        System.out.println(f.getLast());
}
}
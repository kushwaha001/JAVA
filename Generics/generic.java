package Generics;

class A {
    public String toString() {
        return "A";
    }
}

class B extends A {
    public String toString() {
        return "B";
    }
}

class Test <T extends A> {
    T t;
    Test(T t) {
        this.t = t;
    }
    void print() {
        System.out.println(t);  //t.toString()
    }
}

class GenericTX <T, X> {
    T t1;
    X x1;

    public GenericTX(T t1, X x1) {
        this.t1 = t1;
        this.x1 = x1;
    }
    void print() {
        System.out.println("Value of A: " + t1);
        System.out.println("Value of B: " + x1);
    }
}

public class generic {
    public static void main(String[] args) {
        // Test<A> t1 = new Test<>(new A());
        // t1.print();
        // Test<B> t2 = new Test<>(new B());
        // t2.print();
        // Test<A> t3 = new Test<>(new B());
        // t3.print();

        GenericTX<A,B> g1 = new GenericTX<>(new A(), new B());
        g1.print();
        @SuppressWarnings("removal")
        GenericTX<A,Integer> g2 = new GenericTX<>(new A(), new Integer(10));
        g2.print();
}
}

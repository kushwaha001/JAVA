package Multithreading;

class Synchronization1 {
    public synchronized void set() {
        for (int i = 0; i < 500; i++) {
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

class Mythread1 extends Thread {
    Synchronization1 s1 = null;

    public Mythread1(Synchronization1 s1) {
        this.s1 = s1;
    }

    @Override
    public void run() {
        s1.set();
    }
}

class Mythread2 extends Thread {
    Synchronization1 s1 = null;

    public Mythread2(Synchronization1 s1) {
        this.s1 = s1;
    }

    @Override
    public void run() {
        s1.set();
    }
}

public class ManagerWithSync {
    public static void main(String[] args) {
        Synchronization1 s1 = new Synchronization1();
        Mythread1 t1 = new Mythread1(s1);
        Mythread2 t2 = new Mythread2(s1);
        t1.start();
        t2.start();
    }
}

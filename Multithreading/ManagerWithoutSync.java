package Multithreading;

 class Synchronization
 {
     public  void set()
     {
         for (int i = 0; i < 500; i++) {
             System.out.println(Thread.currentThread().getName()+":"+i);
         }
     }
}
class MyThread1 extends Thread
{
    Synchronization s1 =null;
    public MyThread1 (Synchronization s1)
    {
        this.s1=s1;
    }

    @Override
    public void run() {
        s1.set();;
    }
}
class MyThread2 extends Thread {
    Synchronization s1 = null;
    public MyThread2(Synchronization s1)
    {
        this.s1 = s1;
    }

    @Override
    public void run() {
        s1.set();
    }
}
public class ManagerWithoutSync {
    public static void main(String[] args) {
        Synchronization s1=new Synchronization();
        MyThread1 t1 = new MyThread1(s1);
        MyThread2 t2=new MyThread2(s1);
        t1.start();
        t2.start();
    }
}

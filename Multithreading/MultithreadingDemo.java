package Multithreading;
public class MultithreadingDemo extends Thread //1 //ChildThread
{
    public void run()//2   //Default name->Thread-0 (child thread)
    {
        for (int i = 0; i < 100; i+=2) {
            System.out.println(getName()+":"+i);
        }
    }
}
class test2 extends Thread{
    public void run(){
        for (int i = 1; i < 100; i+=2) {
            System.out.println(getName()+":"+i);
        }
    }
}
 class Manager {
    public static void main(String[] args) {
        MultithreadingDemo t1=new MultithreadingDemo();//2
        t1.start();//4  //Main->Thread  //Reg and call run
        test2 t2= new test2();
        t2.start();
        for (int i = 1; i < 100; i+=2) {
            System.out.println(Thread.currentThread().getName()+":"+i);  //Creates object to run getName
        }
        for (int i = 0; i < 100; i+=3) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}

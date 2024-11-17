package Multithreading;

public class Computer extends Thread
{
    public Computer(String name)
    {
        super(name);
    }
    public void run()  //Default name->Thread-0 (child thread)
    {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}
class NameThreadDemo  //main //thread scheduler Garbage Collector
{
    public static void main(String[] args) {   //Main Thread
        Computer c =new Computer("AIDS");/*we can change the name of child thread using
                                              constructor but not of main thread.*/
        c.start();  //Register and call run
    }
}
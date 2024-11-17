package Multithreading;

public class Test extends Thread
{
    public void run(){
        //setName("KK");
        for (int i = 0; i < 100; i+=2) {
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }
            System.out.println(getName()+":"+i);
        }
    }
}
class Sample extends Thread
{
    public void run() {
        //setName("hvbbk")
        for (int j = 1; j < 100; j += 2) {

            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }
            System.out.println(getName() + ":" + j);
        }
    }
}
class Main
{
  public static void main(String[] args)
  {
  Test t=new Test();
  t.setName("testing");
  t.start();
  Sample t1=new Sample();
  t1.setName("KK");
  t1.start();
}
}

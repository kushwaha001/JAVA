package Multithreading;

class RunnableInterface implements Runnable //Used because -> Class extends thread extends Jframe is not possible
{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
 class MyRunnableManager
{
    public static void main(String[] args) {
        RunnableInterface r= new RunnableInterface();
//        Thread t = new Thread();
//        t.start();
        for (int i = 0; i < 100; i+=2) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}

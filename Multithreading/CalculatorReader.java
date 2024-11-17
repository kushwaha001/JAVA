package Multithreading;

class Calculator extends Thread
{
    int total=0;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 1000; i++) {
            total=total+i;
        }
        notify();
    }
}
class Reader extends Thread
{
    Calculator c1=null;
    public Reader(Calculator c1){
        this.c1=c1;
    }

    @Override
    public void run() {
        System.out.println("Total 1 to 1000: "+c1.total);
    }
}
public class CalculatorReader {
    public static void main(String[] args) {
        Calculator c1 =new Calculator();
        new Reader(c1).start();
        new Reader(c1).start();
        new Reader(c1).start();
        c1.start();
    }
}

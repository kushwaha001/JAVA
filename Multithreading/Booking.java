package Multithreading;

public class Booking extends Thread //DeadLock Situation
{
    Object train = null;
    Object comp = null;

    public Booking(Object train, Object comp) {
        super();
        this.train = train;
        this.comp = comp;
    }

    @Override
    public void run() {
        System.out.println(getName() + "Booking start");
        synchronized (train) {
            System.out.println(getName() + "Bookinh train");
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            synchronized (comp) {
                System.out.println(getName() + "Book comp");
            }
            System.out.println(getName() + "Booking end");
        }
    }

    class Cancel extends Thread {

        Object train = null;
        Object comp = null;

        public Cancel(Object train, Object comp) {
            super();
            this.train = train;
            this.comp = comp;

        }

        @Override
        public void run() {
            System.out.println(getName()+"Cancel start");
            synchronized (comp){
                System.out.println(comp);
            }
        }
    }
}
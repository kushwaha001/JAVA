package Multithreading;
class TestSum extends Thread
{
    int total=0;
    public synchronized void run() { //Thread-0
        for (int i = 0; i < 10; i++) {
            total=total+i;
        }
        notify();
    }}
//    public class InterThreadCommunication {
//        public static void main(String[] args)
//        {
//            TestSum ts =new TestSum();
//            ts.start();
//            try{
//                synchronized (ts){
//                    ts.wait();
//                }
//            }
//            catch ()
//        }
//    }
//}
package ExceptionHandling;

public class ExceptionDucking {
    public static void main(String[] args) {
        System.out.println("Main Start");
        test(9);
        System.out.println("Main End");
    }
    public static void test(int i){
        System.out.println("test start");
        test1(9);
        System.out.println("test end");
    }
    public static void test1(int i){
        System.out.println("test1 start");
        /*try{
            test2(9);
        }                --->> test2 end will not run

        catch (ArithmeticException ex){
            ex.printStackTrace();
        }*/

        System.out.println("test1 end");
    }
    public static void test2(int i){
        System.out.println("test2 start");
        int j = i / (i - 9);
        /* try {
            int j = i / (i - 9);
        }
        catch (ArithmeticException ex)
        {*/
        //System.out.println("Divide ny zero");
            //ex.printStackTrace();

        System.out.println("test2 end");
    }
}

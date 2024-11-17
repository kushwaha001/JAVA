package ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int i =9;
        try
        {
            String s=args[0];//d
            i=Integer.parseInt(s);//cannot be string u passes abc
            int j=i/(i-9);// if u pass 9 denominator will be zero
            System.out.println("Value of j -> "+j);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Comamand ine argument is not passed");
        }
        catch (NumberFormatException ex){
            System.out.println("string to int coversion");
        }
        catch (ArithmeticException ex){
            System.out.println("divide by zero");
        }
        finally {
            System.out.println("GSV Rocks");
        }
        System.out.println("Main end");
        }
}

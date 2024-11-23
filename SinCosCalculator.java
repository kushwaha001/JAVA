public class SinCosCalculator {

}
class SinCalculator implements Runnable {
    private double x;
    private int terms;
    private double result;

    public SinCalculator(double x, int terms) {
        this.x = x;
        this.terms = terms;
        this.result = 0.0;
    }

    @Override
    public void run() {
        result = calculateSin(x, terms);
    }

    public double getResult() {
        return result;
    }

    private double calculateSin(double x, int terms) {
        double result = 0.0;
        for (int n = 0; n < terms; n++) {
            double term = Math.pow(-1, n) * Math.pow(x, 2 * n + 1) / factorial(2 * n + 1);
            result += term;
        }
        return result;
    }

    private double factorial(int n) {
        double fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

class CosCalculator implements Runnable {
    private double x;
    private int terms;
    private double result;

    public CosCalculator(double x, int terms) {
        this.x = x;
        this.terms = terms;
        this.result = 0.0;
    }

    @Override
    public void run() {
        result = calculateCos(x, terms);
    }

    public double getResult() {
        return result;
    }

    private double calculateCos(double x, int terms) {
        double result = 0.0;
        for (int n = 0; n < terms; n++) {
            double term = Math.pow(-1, n) * Math.pow(x, 2 * n) / factorial(2 * n);
            result += term;
        }
        return result;
    }

    private double factorial(int n) {
        double fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

class main{
    public static void main(String[] args) {
        double x = Math.PI / 4;
        int terms = 10;

        SinCalculator sinCalculator = new SinCalculator(x, terms);
        CosCalculator cosCalculator = new CosCalculator(x, terms);

        Thread sinThread = new Thread(sinCalculator);
        Thread cosThread = new Thread(cosCalculator);

        sinThread.start();
        cosThread.start();

        try {
            sinThread.join();
            cosThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sin(" + x + ") = " + sinCalculator.getResult());
        System.out.println("Cos(" + x + ") = " + cosCalculator.getResult());
    }
}

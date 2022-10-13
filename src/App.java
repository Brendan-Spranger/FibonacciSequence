class FibonacciNumber {
    static int fibonacciNumber(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return (fibonacciNumber(n - 2) + fibonacciNumber(n - 1));
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        int fibVal;

        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
                fibVal = FibonacciNumber.fibonacciNumber(n);
                System.out.println(fibVal);
            } catch (NumberFormatException e) {
                System.err.println("Input type invalid. Input must be a positive integer. Please restart and try again.");
            }
        }
    }
}
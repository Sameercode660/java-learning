package Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }

    static int fibo(int num) {

        if(num == 0 || num == 1) {
            return 1;
        }

        return fibo(num - 1) + fibo(num - 2);
    }
}

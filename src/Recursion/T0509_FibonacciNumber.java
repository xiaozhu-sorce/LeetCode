package Recursion;

public class T0509_FibonacciNumber {
    public static int fib(int n) {
        if (n == 0 || n == 1){
            return n;
        }else {
            return fib(n-1)+fib(n-2);
        }

    }
}
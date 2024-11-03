package Recursion;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDynamic {

    public static void main(String[] args) {

        Map<Integer, Integer> memo = new HashMap<>();
        System.out.println(FibonacciDynamic.fibo(8, memo));
        System.out.println(Example.num);
    }

    static int fibo(int n, Map<Integer, Integer> memo) {
        if(n <= 1) {
            return n;
        }

        if(memo.containsKey(n)) {
            return memo.get(n);
        }

        int result =  fibo(n - 1, memo) + fibo(n - 2, memo);

        memo.put(n, result);

        return result;
    }
}


class employee{
    int id; // 4byte
    double salary; // 8byte
}
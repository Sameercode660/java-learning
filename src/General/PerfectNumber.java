
//Write a Java program to display all the perfect numbers between 1 to n.

package General;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = input.nextInt();

        for(int i = 1; i <= num; i++) {
            if(perfectNumber(i)) {
                System.out.println(i);
            }
        }

    }

    static boolean perfectNumber(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if(sum == num) return true;

        return false;

    }
}

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[5];

        System.out.println("Enter the element for array: ");
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for(int num : array) {
            System.out.print(num + " ");
        }

        System.out.println(Arrays.toString(array));
    }
}

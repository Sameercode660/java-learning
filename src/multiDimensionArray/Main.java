package multiDimensionArray;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[][] array = {
                {1,2,3,4},
                {5,6},
                {7,8,9,10,11}
        };

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        twoSum func = (int a, int b) -> a + b;

        threeSum func1 = (int a, int b, int c) -> a + b + c;

        System.out.println(func.operation(10, 20));

        System.out.println(func1.operation(19, 29, 20));


    }

    interface twoSum {
        int operation(int a, int b);
    }

    interface threeSum {
        int operation(int a, int b, int c);
    }
}

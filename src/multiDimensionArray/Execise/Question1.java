/*
* Array Basics: Write a program to create an array of integers and initialize it with values. Then, calculate the sum, average, minimum, and maximum values of the array.
* */

package multiDimensionArray.Execise;

public class Question1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6, 7,8, 9, 10};

        System.out.println("Sum of array is: "+ sum(array));
        System.out.println("Average of array is: "+ average(array));
        System.out.println("Minimum of array is: "+ minimum(array));
        System.out.println("Maximum of array is: "+ maximum(array));


    }

    static int sum(int[] array) {
        int result = 0;

        for(int num : array) {
            result += num;
        }

        return result;
    }

    static double average(int[] array) {
        int totalElement = array.length;
        int sum = sum(array);

        double result = (double)(sum / totalElement);

        return result;

    }

    static int minimum(int[] array){
        int minimum = array[0];

        for(int num : array) {
            if(num < minimum) {
                minimum = num;
            }
        }

        return minimum;
    }

    static int maximum(int[] array) {
        int maximum = array[0];

        for(int num : array) {
            if(num > maximum) {
                maximum = num;
            }
        }

        return maximum;
    }
}

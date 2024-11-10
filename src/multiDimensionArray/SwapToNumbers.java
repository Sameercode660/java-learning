package multiDimensionArray;

import java.util.Arrays;

public class SwapToNumbers {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        swap(array, 3, 5);

        System.out.println(Arrays.toString(array));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

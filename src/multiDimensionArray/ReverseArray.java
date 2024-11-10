package multiDimensionArray;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

         int[] array = {1,2,3,4,5,6,7,8,9,10};

         reverse(array, 0, 9);

        System.out.println(Arrays.toString(array));

        String str = Arrays.toString(array);

        System.out.println(str);
    }

    static void reverse(int[] array, int start, int end) {

        for(int i = 0; i < array.length; i++) {
            if( start > end ) {
                return;
            }

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }
    }


}

package Recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(binarySearch(0, 9, array, 19));
    }

    static boolean binarySearch(int low, int high, int [] array, int num) {

        if(low > high) {
            return false;
        }

        int mid = (low + high) / 2;

        if(array[mid]  == num) {
            return true;
        }
        else if(array[mid] > num) {
            return binarySearch(low, mid-1, array, num);
        }
        else {
            return binarySearch(mid + 1, high, array, num);
        }

    }

}

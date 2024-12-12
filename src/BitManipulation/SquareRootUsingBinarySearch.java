package BitManipulation;

public class SquareRootUsingBinarySearch {
    public static void main(String[] args) {
        int num = 40;

        int start = 0;
        int end = 36;

        while( start < end) {
            int mid = (start + end) / 2;

            if(mid * mid > num) {
                end = mid - 1;
            } else if( mid * mid < num) {
                start = mid + 1;
            } else if ( mid  * mid == num) {
                System.out.println(mid);
                break;
            }
        }
    }
}

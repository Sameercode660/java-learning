package multiDimensionArray;

public class MaxItem {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(maximum(array));

    }

    static int maximum(int [] array) {
        int maximum = array[0];

        for(int num : array) {
            if(num > maximum) {
                maximum = num;
            }
        }

        return  maximum;
    }
}

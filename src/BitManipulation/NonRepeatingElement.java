// Find the only non-repeating element in an array where every other element repeats twice


package BitManipulation;

public class NonRepeatingElement {
    public static void main(String[] args) {
         int [] array = {1,2,3,4,1,2,3,5};
         int result = 0;

         for(int num: array) {
             result ^= num;
         }

         System.out.println(result);
    }

}

// Duplicate Elements: Write a function to find and return duplicate elements in an integer array. Try different approaches (e.g., using nested loops, HashSet) and analyze their time complexities.

package multiDimensionArray.Execise;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,4,6,6,8,8,9,5};

        Collection<Integer> duplicateValue = findDuplicates(array);

        System.out.println(duplicateValue);
    }

    static Collection<Integer> findDuplicates(int[] array) {
        Map<Integer, Integer> duplicateElementList = new HashMap<>();

        for(int num : array) {
            if(countElementOccurrence(array, num) > 1) {
                if(duplicateElementList.containsKey(num)) {
                    continue;
                } else  {
                    duplicateElementList.put(num, num);
                }
            }
        }

        return duplicateElementList.values();
    }

    static int countElementOccurrence(int[] array, int num) {
        int count = 0;

        for(int element : array) {
            if(element == num) {
                count++;
            }
        }

        return count;
    }
}

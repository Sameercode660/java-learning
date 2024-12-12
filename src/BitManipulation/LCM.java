package BitManipulation;

import java.util.ArrayList;

public class LCM {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        int num1 = 6;
        int num2 = 12;

        for(int i = 2; true; i++) {
            array1.add(num1 * i);
            array2.add(num2 * i);

            for(int j = 0; j < array2.size(); j++) {
                if((num1 * i) == array2.get(j)) {
                    System.out.println(num1 * i);
                    System.exit(1);
                }

            }
        }
    }
}

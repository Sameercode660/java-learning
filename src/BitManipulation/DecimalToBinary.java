package BitManipulation;

import java.util.ArrayList;

public class DecimalToBinary {
    public static void main(String[] args) {
        int number = 17;
        ArrayList<Integer> arrayOfBinary = new ArrayList<>();

        while(number > 0) {
            int remainder = number % 8;
            System.out.println(remainder);
            number /= 8;
            arrayOfBinary.add(remainder);
        }

        for(int i = arrayOfBinary.size() - 1; i >= 0; i--) {
            System.out.print(arrayOfBinary.get(i));
        }

    }
}

package General;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseUsingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter How many number you want to inter: ");
        int num = input.nextInt();

        for(int i = 0; i < num; i++) {
            System.out.print("Enter the " + i + "th number: ");
            int temp = input.nextInt();
            array.add(temp);
        }

        for(int i = array.size() - 1; i >= 0; i--) {
            System.out.println(array.get(i));
        }
    }
}

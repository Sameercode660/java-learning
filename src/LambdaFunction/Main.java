package LambdaFunction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            array.add(i);
        }

        array.forEach((value) -> System.out.println(value));
    }


}

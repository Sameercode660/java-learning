package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        Human sameer = new Human(34, "Sameer");

        try {
            Human twin = (Human) sameer.clone();

            twin.arr[0] = 100;

            System.out.println(Arrays.toString(twin.arr));
            System.out.println(Arrays.toString(sameer.arr));
        }catch (Exception e) {
            System.out.println("Please implement the Cloneable interface");
        }
    }
}

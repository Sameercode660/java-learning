package BitManipulation;

public class SquareRoot {
    public static void main(String [] args) {
        int num = 49;

        int startPoint = 0;
        int endpoint = num / 2;

        for(int i = startPoint; i <= endpoint; i++) {
            if(i * i == num) {
                System.out.println("Square root of " + num + " is: " + i);
                break;
            }
        }
    }
}

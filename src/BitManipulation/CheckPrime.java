package BitManipulation;

public class CheckPrime {
    public static void main(String[] args) {
        int num = 12;

        boolean result = true;

        for(int i = 2; i < 13; i++) {
            if(num % i == 0) {
                result = false;
                break;
            }
        }

        if(result) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }

    }
}

package BitManipulation;

public class PrimeInRange {
    public static void main(String[] args) {
        int num = 40;

        for(int i = 2; i < 40; i++) {
            if(checkPrime(i)) {
                System.out.println(i + " is a prime number");
            }
        }
    }

    static boolean checkPrime(int num) {
        if(num == 2) {
            return true;
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

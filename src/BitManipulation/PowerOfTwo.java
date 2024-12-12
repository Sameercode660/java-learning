package BitManipulation;

public class PowerOfTwo {
//    formual if n & (n-1) == 0 then n is power of two
public static void main(String[] args) {
    int num = 8;

    int result = num & (num - 1);

    if(result == 0) {
        System.out.println("Number is power of two");
    } else {
        System.out.println("Number is not power of two");
    }
}


}

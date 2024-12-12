package RecursionQuestions.Easy;

// program to print the number form N to 1
public class Nto1 {
    public static void main(String[] args) {
        int num = 5;

        printFromNto1(num);
    }

    private static void printFromNto1(int num) {
        if(num == 0) {
            return;
        }
        System.out.println(num);
        printFromNto1(num - 1);
    }
}

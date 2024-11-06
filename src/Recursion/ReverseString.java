package Recursion;

public class ReverseString {
    public static void main(String[] args) {

        char [] string  = {'S', 'a', 'm', 'e', 'e', 'r'};

        reverse(0, 5, string);

        for(char ch : string) {
            System.out.print(ch);
        }
    }

    static void reverse(int start, int end, char [] string) {

        if(start >= end) {
            return;
        }

        char temp = string[start];
        string[start] = string[end];
        string[end] = temp;

        reverse(++start, --end, string);

    }
}

package String;

public class Palindrome {
    public static void main(String[] args) {

        String name = "aba";

        boolean result = palindrom(name);

        if(result == true) {
            System.out.println("Given string is Palindrome");
        } else {
            System.out.println("Given string is not Palindrome");
        }

    }

    static boolean palindrom(String str) {

        char[] characterArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        while ( start < end) {
            if(characterArray[start] != characterArray[end]) {
                return false;
            }
            start ++;
            end --;

        }

        return true;
    }
}

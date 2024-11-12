package String;

public class ReverseString {
    public static void main(String[] args) {

        String name = "Sameer";

        String reverseString = reverse(name);

        System.out.println(reverseString);
    }

    static String reverse(String str) {
        char[] CharacterString = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        while(start < end) {
            char temp = CharacterString[start];
            CharacterString[start] = CharacterString[end];
            CharacterString[end] = temp;
            start++;
            end--;
        }

        return new String(CharacterString);

    }
}

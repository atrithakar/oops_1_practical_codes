// A set of 5 words (strings) will be taken as command line arguments. Write a program to reverse each word and check whether it is palindrome or not using method.

public class program_1 {

    private static boolean checkPalindrome(String s) {

        StringBuilder reverse = new StringBuilder();

        for (int i = s.length() - 1; i > -1; i--) {
            reverse.append(s.charAt(i));
        }
        return s.equals(reverse.toString());
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.printf("Is string %d palindrome? %b\n", i, checkPalindrome(args[i]));
        }
    }
}

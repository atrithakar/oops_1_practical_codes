import java.util.Scanner;

public class program_7 {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a character: ");
        ch = sc.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The given character is a vowel");
        } else {
            System.out.println("The given character is a consonant");

        }
        sc.close();
    }
}

import java.util.Scanner;

public class program_6 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        a = sc.nextInt();
        System.out.printf("Enter second number: ");
        b = sc.nextInt();
        System.out.printf("Enter third number: ");
        c = sc.nextInt();
        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.printf("%d %d %d", a, b, c);
            } else {
                System.out.printf("%d %d %d", a, c, b);

            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.printf("%d %d %d", b, a, c);
            } else {
                System.out.printf("%d %d %d", b, c, a);

            }

        } else {
            if (a >= b) {
                System.out.printf("%d %d %d", c, a, b);
            } else {
                System.out.printf("%d %d %d", c, b, a);

            }

        }
        sc.close();
    }

}

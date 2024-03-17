/*
 * Patterns:
 *      ****
 *      ***    -->Done
 *      **
 *      *
 * 
 *      1234
 *      123    -->Done
 *      12
 *      1
 * 
 *      1234
 *      567    -->Done
 *      89
 *      0
 * 
 *      __*
 *      _***
 *      *****  -->Done
 *      _***
 *      __*
 */

public class program_11 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.printf("%d ", j + 1);
            }
            System.out.println();
        }
        System.out.println();

        int counter = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                counter++;
                if (counter == 10) {
                    System.out.printf("0");
                } else {
                    System.out.printf("%d ", counter);
                }
            }
            System.out.println();
        }
        System.out.println();
        int n = 4;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

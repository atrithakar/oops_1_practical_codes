// 8.	A cashier has currency notes of denominations 1, 2, 5, 10, 50 and 100. If the amount to be withdrawn is input through the keyboard, find the total number of currency notes of each denomination the cashier will have to give to the withdrawer.

import java.util.Scanner;

public class program_8 {
    public static void main(String[] args) {
        int amount;
        int note_1 = 0, note_2 = 0, note_5 = 0, note_10 = 0, note_50 = 0, note_100 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the amount to be withdrawn: ");
        amount = sc.nextInt();
        while (amount != 0) {
            if (amount >= 100) {
                note_100++;
                amount -= 100;
            } else if (amount >= 50) {
                note_50++;
                amount -= 50;
            } else if (amount >= 10) {
                note_10++;
                amount -= 10;
            } else if (amount >= 5) {
                note_5++;
                amount -= 5;
            } else if (amount >= 2) {
                note_2++;
                amount -= 2;
            } else {
                note_1++;
                amount--;
            }
        }
        System.out.printf(
                "To withdraw the given amount you will require:\n%d notes of denomination 100\n%d notes of denomination 50\n%d notes of denomination 10\n%d notes of denomination 5\n%d notes of denomination 2\n%d notes of denomination 1\n",
                note_100, note_50, note_10, note_5, note_2, note_1);
        sc.close();
    }
}

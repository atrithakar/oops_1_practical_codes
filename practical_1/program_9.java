// 9.	If a five-digit number is input through the keyboard, write a program to print a new number by adding one to each of its digits. For example, if the number that is input is 12391 then the output should be displayed as 23502.

import java.util.Scanner;

public class program_9 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a five digit number: ");
        a = sc.nextInt();
        System.out.println("The answer is " + (a+11111));
        sc.close();
    }
}

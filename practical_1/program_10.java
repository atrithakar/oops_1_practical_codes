
// 10.	If lengths of three sides of a triangle are input through the keyboard, write a program to print the area of the triangle.
// ABC = √[s × (s – a) × (s – b) × (s – c)].
import java.util.Scanner;
import java.lang.Math;

public class program_10 {
    public static void main(String[] args) {
        int a, b, c;
        double s, area;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the lengh of first side: ");
        a = sc.nextInt();
        System.out.printf("Enter the lengh of second side: ");
        b = sc.nextInt();
        System.out.printf("Enter the lengh of third side: ");
        c = sc.nextInt();
        s = (a + b + c) / 2.0;
        System.out.println(s);
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of the triangle is " + area + " sq units.");
        sc.close();
    }
}

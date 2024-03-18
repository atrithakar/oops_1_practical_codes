// Write a java program to implement an interface called Exam with a method Pass (int mark) that returns a boolean. Write another interface called Classify with a method Division (int average) which returns a String. Write a class called Result which implements both Exam and Classify. The Pass method should return true if the mark is greater than or equal to 50 else false. The Division method must return "First" when the parameter average is 60 or more, "Second" when average is 50 or more but below 60, "No division" when average is less than 50.

import java.util.Scanner;

interface exam {
    boolean pass(int marks);
}

interface classify {
    String division(int average);
}

class result implements exam, classify {
    private int marks;

    public boolean pass(int marks) {
        return marks >= 50;
    }

    public String division(int average) {
        if (average >= 60) {
            return "First";
        } else if (average >= 50) {
            return "Second";

        } else {
            return "No Division";

        }
    }
}

public class program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your marks: ");
        int marks = sc.nextInt();

        result r = new result();
        System.out.printf("Has student passed the exam? %b\n", r.pass(marks));
        System.out.printf("Division: %s\n", r.division(marks));
    }
}

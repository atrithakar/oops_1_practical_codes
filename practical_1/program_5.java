import java.util.Scanner;

public class program_5 {
    public static void main(String[] args) {
        float weight, height_in_metres, bmi;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your weight: ");
        weight = sc.nextFloat();
        System.out.printf("Enter your height in metres: ");
        height_in_metres = sc.nextFloat();
        bmi = weight/(height_in_metres*height_in_metres);
        System.out.printf("Your BMI is %f", bmi);
        sc.close();
    }
}

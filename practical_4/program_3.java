// Write a program that finds area of any shape by overloading area () method for Square, Rectangle, Triangle and Square.

class areaCalculator {
    double find_area(double l) {
        return l * l;
    }

    double find_area(double w, double h) {
        return w * h;
    }

    double find_area(double b, double h, boolean isTriangle) {
        if (isTriangle)
            return 0.5 * b * h;
        else
            return -1;
    }
}

public class program_3 {
    public static void main(String[] args) {
        areaCalculator a = new areaCalculator();
        double square_length = 5.7;
        System.out.printf("Area of square = %f sq. units\n", a.find_area(square_length));

        double rectangle_width = 7.6, rectangle_height = 8.9;
        System.out.printf("Area of rectangle = %f sq. units\n", a.find_area(rectangle_width, rectangle_height));

        double triangle_base = 9.6, triangle_height = 7.3;
        boolean isTriangle = true;
        System.out.printf("Area of triangle = %f sq. units\n", a.find_area(triangle_base, triangle_height, isTriangle));

    }
}

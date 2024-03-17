// Design a class named Rectangle to represent a rectangle. The class contains: Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
// A no-arg constructor that creates a default rectangle.
// A constructor that creates a rectangle with the specified width and height.
// A method named getArea() that returns the area of this rectangle.
// A method named getPerimeter() that returns the perimeter.

class rectangle {
    double width, height;

    rectangle() {
        width = height = 1;
    }

    rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class program_2 {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        System.out.printf("Area of r1: %f\nPerimeter of r1: %f\n", r1.getArea(), r1.getPerimeter());
        rectangle r2 = new rectangle(3, 4);
        System.out.printf("Area of r2: %f\nPerimeter of r2: %f\n", r2.getArea(), r2.getPerimeter());
    }
}

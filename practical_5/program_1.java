// Describe abstract class called Shape which has three subclasses say Triangle, Rectangle, Circle. Define one method area() in the abstract class and override this area() in these three subclasses to calculate for specific object, i.e., area() of Triangle subclass should calculate area of triangle etc. Same for Rectangle and Circle.

// Area = Square root of√s(s - a)(s - b)(s - c) where s is half the perimeter, or (a + b + c)/2

abstract class shape {
    abstract void displayArea();
}

class traingle extends shape {
    double a, b, c;

    traingle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void displayArea() {
        double s = (a + b + c) / 2;
        double a_2 = s * (s - a) * (s - b) * (s - c);
        double a = Math.sqrt(a_2);

        System.out.printf("Area of the triangle is: %f\n", a);
    }
}

class rectangle extends shape {
    double l, w;

    rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    @Override
    void displayArea() {
        System.out.printf("Area of the rectangle is: %f\n", this.l * this.w);
    }
}

class circle extends shape {
    double r;

    circle(double r) {
        this.r = r;
    }

    @Override
    void displayArea() {
        System.out.printf("Area of the circle is: %f\n", 3.1415926 * this.r * this.r);
    }
}

public class program_1 {
    public static void main(String[] args) {
        shape s;
        traingle t = new traingle(4.38, 6.24, 9.35);
        t.displayArea();
        s = t;
        s.displayArea();

        rectangle r = new rectangle(4.65, 6.24);
        r.displayArea();
        s = r;
        s.displayArea();

        circle c = new circle(4.24);
        c.displayArea();
        s = c;
        s.displayArea();
    }
}

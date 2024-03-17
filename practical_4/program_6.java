// Create a base class Shape. Use this class to store two double type values that could be used to compute area of any shape. Derive two specific classes called Triangle and Rectangle from the base shape. Add to the base a member function getdata() to initialize base class data member and another member function display_area() to compute and display the area of figures. (Use Method Overriding).

abstract class shape {
    protected double l, w;

    void getData(double l, double w) {
        this.l = l;
        this.w = w;
    }

    abstract void displayArea();
}

class rectangle extends shape {
    void displayArea() {
        System.out.printf("Area of rectangle = %f\n", this.l * this.w);
    }
}

class triangle extends shape {
    void displayArea() {
        System.out.printf("Area of traingle = %f\n", 0.5 * this.l * this.w);
    }
}

public class program_6 {
    public static void main(String[] args) {

        shape s;
        rectangle r = new rectangle();
        r.getData(5.7, 6.1);
        r.displayArea();

        triangle t = new triangle();
        t.getData(5.7, 6.1);
        t.displayArea();

        s = r;
        s.displayArea();
        s = t;
        s.displayArea();
    }
}

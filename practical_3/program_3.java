// Define a class called Cartesian Point, which has two instance variables, x and y. Provide the methods get X() and get Y() to return the values of the x and y values respectively, a method called move() which would take two integers as parameters and change the values of x and y respectively, a method called display() which would display the current values of x and y. Now overload the method move() to work with single parameter, which would set both x and y to the same values,provide constructors with two parameters and overload to work with one parameter as well. Now define a class called Test Cartesian Point, with the main method to test the various methods in the Cartesian Point class.

class cartesianPoint {
    int x, y;

    cartesianPoint(int _x, int _y) {
        x = _x;
        y = _y;
    }

    cartesianPoint(int val) {
        x = y = val;
    }

    int getX(){
        return x;
    }
    int getY() {
        return y;
    }
    void move(int _x, int _y) {
        x = _x;
        y = _y;
    }
    void move(int val) {
        x = y = val;
    }

}

public class program_3 {
    public static void main(String[] args) {
        
        cartesianPoint p1 = new cartesianPoint(4, 7);
        System.out.printf("For p1:\n");
        System.out.printf("Before:\nx: %d\ny: %d\n",p1.getX(),p1.getY());
        p1.move(8, 6);
        System.out.printf("After:\nx: %d\ny: %d\n",p1.getX(),p1.getY());

        cartesianPoint p2 = new cartesianPoint(5);

        System.out.printf("For p2:\n");
        System.out.printf("Before:\nx: %d\ny: %d\n",p2.getX(),p2.getY());
        p2.move(6);
        System.out.printf("After:\nx: %d\ny: %d\n",p2.getX(),p2.getY());
    }
}

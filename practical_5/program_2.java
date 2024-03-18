// Write a program that demonstrates the instance of operator. Declare interfaces I1 and I2. Interface I3 extends both of these interfaces. Also declare interface I4. Class X implements I3. Class W extends X and implements I4. Create an object of class W. Use the instance of operator to test if that object implements each of the interfaces and is of type X.

interface I1 {
}

interface I2 {
}

interface I3 extends I1, I2 {
}

interface I4 {
}

class X implements I3 {
}

class W extends X implements I4 {
}

public class program_2 {

    public static void main(String[] args) {
        W obj = new W();
        if (obj instanceof I1) {
            System.out.println("obj implements interface I1");
        }
        if (obj instanceof I2) {
            System.out.println("obj implements interface I2");
        }
        if (obj instanceof I3) {
            System.out.println("obj implements interface I3");
        }
        if (obj instanceof I4) {
            System.out.println("obj implements interface I4");
        }
        if (obj instanceof X) {
            System.out.println("obj is of type X");
        }
    }
}

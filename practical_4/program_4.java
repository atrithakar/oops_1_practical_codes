class volumeCalculator {
    double find_volume(double l) {
        return l * l * l;
    }

    double find_volume(double l, double b, double h) {
        return l * b * h;
    }

    double find_volume(double r, boolean isSphere) {
        if (isSphere) {
            double pi = 3.1415926;
            return (4 / 3) * pi * r * r * r;
        } else {
            return -1;
        }
    }
}

public class program_4 {
    public static void main(String[] args) {
        volumeCalculator v = new volumeCalculator();
        double cube_length = 6.5;
        System.out.printf("The volume of the cube is %f cu. units\n", v.find_volume(cube_length));

        double rect_cube_length = 4.6, rect_cube_width = 7.8, rect_cube_height = 9.6;
        System.out.printf("The volume of the rectangular cube is %f cu. units\n",
                v.find_volume(rect_cube_length, rect_cube_width, rect_cube_height));

        double sphere_radius = 3.7;
        boolean isSphere = true;
        System.out.printf("The volume of the sphere is %f cu. units\n", v.find_volume(sphere_radius, isSphere));
    }
}

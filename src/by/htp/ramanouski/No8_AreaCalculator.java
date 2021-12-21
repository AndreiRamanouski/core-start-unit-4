package by.htp.ramanouski;

public class No8_AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));

    }


    public static double area(double radius) {
        double returnedValue;
        if (radius < 0) {
            returnedValue = -1;
        } else {
            returnedValue = radius * radius * 3.14;
        }
        return returnedValue;
    }

    public static double area(double x, double y) {
        double returnedValue;
        if (x < 0 || y < 0) {
            returnedValue = -1;
        } else {
            returnedValue = x*y;
        }
        return returnedValue;
    }
}

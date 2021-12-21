package by.htp.ramanouski;

public class No1_SpeedConventer {

    public static void main(String[] args) {

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);

    }

    public static void printConversion(double kilometersPerHour) {
        String result = "%s km/h = 1 mi/h";
        System.out.println(result.formatted(kilometersPerHour, toMilesPerHour(kilometersPerHour)));
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1L;
        }
        return Math.round(kilometersPerHour / 1.60934);
    }
}

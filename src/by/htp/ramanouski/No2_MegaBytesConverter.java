package by.htp.ramanouski;

public class No2_MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        String result = "%s KB = %s MB and %s KB";
        double megabytesResult = convertToBytes(kiloBytes);
        int megabytes = (int) megabytesResult;
        long afterDot = Math.round(1000 * (megabytesResult - megabytes));
        System.out.println(result.formatted(kiloBytes, megabytes, afterDot));

    }

    public static double convertToBytes(int kiloBytes) {
        int kiloBytesInMegabyte = 1024;
        return (double) kiloBytes / kiloBytesInMegabyte;
    }
}

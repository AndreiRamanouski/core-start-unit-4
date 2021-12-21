package by.htp.ramanouski;

public class No4_LeapYearCalculator {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }


    public static boolean isLeapYear(int year){
        boolean result = false;
        if(year>=1 && year<=9999){
            if (year % 4 == 0) {
                if(year%100==0){
                    if(year%400==0){
                        result = true;
                    }
                }
            }
        }
        return result;
    }

}
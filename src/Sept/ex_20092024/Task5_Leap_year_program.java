package Sept.ex_20092024;

public class Task5_Leap_year_program {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeapYear = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            isLeapYear = true;
        }
        if (isLeapYear)
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year.");
        }
    }
}

package Sept.ex_23092024;

public class Task2_Calender_SwitchStatement {
    // Write a program that takes an integer input(1-12) and prints the name
    // of the corresponding month using a switch statement
    // Input - 12
    // Output - Dec

    public static void main(String[] args) {
        int Month = 12;
        switch (Month) {
            case 1:
                System.out.println("the month is jan");
                break;
            case 2:
                System.out.println("the month is Feb");
                break;
            case 3:
                System.out.println("the month is Mar");
                break;
            case 4:
                System.out.println("the month is April");
                break;
            case 5:
                System.out.println("the month is MAY");
                break;
            case 6:
                System.out.println("the month is June");
                break;
            case 7:
                System.out.println("the month is July");
                break;
            case 8:
                System.out.println("the month is Aug");
                break;
            case 9:
                System.out.println("the month is SEP");
                break;
            case 10:
                System.out.println("the month is OCT");
                break;
            case 11:
                System.out.println("the month is N0v");
                break;
            case 12:
                System.out.println("the month is DEC");
                break;
        }
    }
}

package Sept.ex_23092024;

public class Task1_Calculator_Switch {
    // Another method
    //Create a simple calculator that performs addition, subtraction, multiplication,
    // and division, modulus based on user input using switch statements.
    //   Inputs :   num 1, num 2, +
    //  Output :  num1+num2 → print information.
    public static void main(String[] args) {

        int num1 = 20, num2 = 10;
        char operation = '+';
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result of addition is " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result of Subtraction is " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result of Multiplication is " + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println("Result of division is " + result);
                break;

            case '%':
                result = num1 % num2;
                System.out.println("Result of modulus is " + result);
                break;

            default:
                System.out.println("Operation is not valid");
                break;
        }
    }
}
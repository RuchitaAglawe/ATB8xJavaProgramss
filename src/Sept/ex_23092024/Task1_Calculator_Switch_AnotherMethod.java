package Sept.ex_23092024;

public class Task1_Calculator_Switch_AnotherMethod {
    // Create a simple calculator that performs addition, subtraction,
    // multiplication, division, modus based on user input using switch statements.
    // Input: num1, num2, +
    // Output: num1+num2 -> print information.

    public static void main(String[] args) {
        int num1=100;
        int num2=30;
        int choice=1;

        switch (choice){
            case 1 :
                int add=num1+num2;
                System.out.println("Addition is  : " + add);
                break;
            case 2 :
                int sub=num1-num2;
                System.out.println("Subtraction is : " + sub);
                break;
            case 3 :
                int multiply=num1*num2;
                System.out.println("Multiplication is : " + multiply);
                break;
            case 4 :
                int divide=num1/num2;
                System.out.println("Division is  : " + divide);
                break;
            case 5:
                int modulo=num1%num2;
                System.out.println("Modulus operation is  : " + modulo);
                break;
            default:
                System.out.println("No operation to perform");
                break;
        }

        System.out.println("End of the switch statement");
    }
        }



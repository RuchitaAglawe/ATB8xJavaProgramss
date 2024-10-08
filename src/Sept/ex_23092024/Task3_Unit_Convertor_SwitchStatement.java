package Sept.ex_23092024;

public class Task3_Unit_Convertor_SwitchStatement {
        //(3) Write a program that converts between different units
        // (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
        //         Input. -
        // choice - 1 - km → m, km → 1km
        // choice - 2 - f → c, f → c

        public static void main (String[]args){
            int Chioce_1 = 'B';
            switch (Chioce_1) {
                case 'A':
                    System.out.println("conversion of km to miles *0.621371:" + (Chioce_1 * 0.621371));
                    break;
                case 'B':
                    System.out.println("conversion of F to C :°C = (°F - 32) × 5/9:" + ((Chioce_1 - 32) * 5 / 9));
                    break;
                default:
                    System.out.println("invalid Retry");
            }
        }
    }

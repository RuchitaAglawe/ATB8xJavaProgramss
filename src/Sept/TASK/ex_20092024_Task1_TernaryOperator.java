package Sept.TASK;

public class ex_20092024_Task1_TernaryOperator {
    public static void main(String[] args) {
        // Ternary operators max between 3 numbers.
        // Input int - a,b,c - a = 10, b = 20, c = 45
        // Max → a,b,c → c

        int a = 10;
        int b= 20;
        int c =45;

        String max = (a>b && a>c)? "a":(b>a && b>c)? "b": (c>a && c>b)? "c":"some of this are equal numbers";

        System.out.println(max);

    }
}

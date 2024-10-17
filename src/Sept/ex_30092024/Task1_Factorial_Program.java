package Sept.ex_30092024;

public class Task1_Factorial_Program {
    public static void main(String[] args) {
        // Factorial Program - n=5, Output = 120
        // n=5 -> Fact= 5*4*3*2*1 = 120
        // n=1 -> Fact= 1*1 -> 1
        // n=3 -> Fact = 3*2*1 -> 6
        int n=5;
        int fact=1;

        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of a number is: "+fact);
    }
}

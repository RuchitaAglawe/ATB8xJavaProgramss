package Sept.TASK;

public class ex_25092024Task3_Prime_number {
    public static void main(String[] args) {
        // Prime numbers between 1 and 100.(for loop)
        int num = 2;
        System.out.println("Prime numbers between 1 and 100 are:");

        for (num = 2; num <= 100; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}

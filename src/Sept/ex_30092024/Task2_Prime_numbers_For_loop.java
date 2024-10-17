package Sept.ex_30092024;

public class Task2_Prime_numbers_For_loop {
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

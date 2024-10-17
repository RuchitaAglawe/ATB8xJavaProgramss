package Sept.ex_30092024;

public class Task4_Prime_number {
    public static void main(String[] Args) {

        //Prime Number from 1 to 100
        //number divisble itself and 1


        for (int i = 1; i <= 100; i++) {
            int count = 0;
            if (i >= 2) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(i + "number is prime");
                }
            }
        }
    }
}

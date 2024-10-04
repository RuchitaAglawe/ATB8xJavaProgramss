package Sept.ex_18092024;

public class Task1 {
        public static void main(String[] args)
        {
            // Give some another example of
            // widening with implicit and explicit,
            // narrowing with implicit and explicit.

            // Widening
            short a = 100;
            int b = a;  // Valid - Implicit Casting - JVM
            int b1 = a; // Valid - Explicit Casting - JVM
            System.out.println(b1);

            //Narrowing
            int val = 380; // Invalid - Implicit Casting - JVM
            short b2 = (short) val;  // Invalid - Explicit Casting - Loss of data
            System.out.println(b2);
        }
    }

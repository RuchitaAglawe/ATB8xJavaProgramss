package Sept.ex_18092024;

public class Lab052 {
    public static void main(String[] args) {
        // GST = 18.45;
        int course = 100;
        float GST = 18.45f;
       // int total_price = course+GST; //Narrowing - implicit - JVM - Invalid
        // float total_price = course+GST; //Narrowing - implicit - JVM - Invalid
       //  System.out.println(total_price);

        int total_price = course+(int)GST; //Narrowing - Explicit - loss
        System.out.println(total_price);
    }
}

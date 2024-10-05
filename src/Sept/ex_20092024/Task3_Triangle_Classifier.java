package Sept.ex_20092024;

public class Task3_Triangle_Classifier {
    public static void main(String[] args) {
        //Triangle Classifier (if)
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the length of the sides, determine

        // if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or
        // scalene (no sides are equal).
        int a = 10;
        int b = 20;
        int c = 30;

        if (a == b && a == c) {
            System.out.println("Triangle is equilateral ");
        } else if (a == b && a != c) {
            System.out.println("isosceles");
        } else if (a == c && a != b) {
            System.out.println("isosceles");
        } else if (b == c && b != a) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }

    }
}

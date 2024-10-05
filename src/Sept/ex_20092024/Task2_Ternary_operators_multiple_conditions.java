package Sept.ex_20092024;

public class Task2_Ternary_operators_multiple_conditions {
    public static void main(String[] args) {
        //Ternary operator to handle multiple conditions.
        // Input → int score = 85
// String grade →
//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C

        int score = 85;

        String grade = (score>=90) ? "A":(score>=80) ?"B":(score>=70) ?"C":"F";

        System.out.println(grade);
    }
}

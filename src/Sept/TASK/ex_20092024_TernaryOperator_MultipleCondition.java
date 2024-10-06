package Sept.TASK;

public class ex_20092024_TernaryOperator_MultipleCondition {
    public static void main(String[] args) {
        //Ternary operator to handle multiple conditions.
        // Input → int score = 85
// String grade →
//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C

        int score = 85;

        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "F";

        System.out.println(grade);
    }
}

package Sept.ex_30092024;

public class Task3_Count_vowels_and_consonants {
    public static void main(String[] args) {
        //Count vowels and consonants in a String.(pramod) - v=2, c=4
        String str = "pramod";
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

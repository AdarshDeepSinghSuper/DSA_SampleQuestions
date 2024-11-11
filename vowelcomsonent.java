import java.util.Scanner;

public class vowelcomsonent {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Enter a sentence");
        String input = sc.nextLine();
        input = input.toLowerCase(); // Convert the input to lowercase for case-insensitive comparison

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}

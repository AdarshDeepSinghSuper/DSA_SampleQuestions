import java.util.*;

public class vowelandconsonentinstring {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a sentence");
        String s =sc.nextline();
        s=s.toLowerCase();//convert to lower case
        int vowel=0;
        int consonant=0;
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);



    }

    
}

import java.util.Scanner;
import java.util.Stack;

public class ReverseSentence {
    public static void reverseSentence(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder word = new StringBuilder();
            while (i < s.length() && s.charAt(i) != ' ') {
                word.append(s.charAt(i));
                i++;
            }
            stack.push(word.toString());
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        reverseSentence(s);
        scanner.close();
    }
}

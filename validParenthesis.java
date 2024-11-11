public class validParenthesis {
    public static boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false; 
        }
        for (int i = 0; i < n - 1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            if ((a == '(' && b != ')') || (a == '[' && b != ']') || (a == '{' && b != '}')) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "()";
        boolean isValid = isValid(s);
        System.out.println(isValid);
    }
}

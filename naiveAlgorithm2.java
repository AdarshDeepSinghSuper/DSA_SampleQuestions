public class naiveAlgorithm2 {
    public static int search(String pat, String txt) {
        int m = pat.length();
        int n = txt.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                // System.out.println("Pattern found at index: " + i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String txt = "sadbutsad";
        String pat = "sad";
        int y = search(pat, txt);
        if(y==-1)
        {
            System.out.println("Pattern not found!");
        }
        else{
            System.out.println("Pattern found at index : "+y);
        }
    }
}

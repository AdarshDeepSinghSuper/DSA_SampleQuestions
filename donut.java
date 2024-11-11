import java.util.Arrays;

public class donut {
    public static void main(String[] args) {
        double A = 0, B = 0; // Rotation angles
        double i, j; // Loop control variables

        // Screen size
        int width = 40; 
        int height = 12;

        // Donut parameters
        double R1 = 1; // Radius of the inner ring
        double R2 = 2; // Radius of the outer ring
        double K2 = 5; // Distance from the viewer
        double K1 = width * K2 * 3 / (8 * (R1 + R2)); // Scaling factor

        // Infinite loop to keep the donut rotating
        while (true) {
            // Z-buffer for depth calculation
            double[] zBuffer = new double[width * height];
            Arrays.fill(zBuffer, 0, width * height, 0);

            // Character buffer for rendering
            char[] screen = new char[width * height];
            Arrays.fill(screen, 0, width * height, ' ');

            // Nested loops to simulate rotation
            for (j = 0; j < 6.28; j += 0.07) {
                for (i = 0; i < 6.28; i += 0.02) {
                    double c = Math.sin(i), d = Math.cos(j), e = Math.sin(A), f = Math.sin(j), g = Math.cos(A);
                    double h = d + R2, D = 1 / (c * h * e + f * g + K2);
                    double l = Math.cos(i), m = Math.cos(B), n = Math.sin(B);
                    double t = c * h * g - f * e;
                    int x = (int) (width / 2 + 30 * D * (l * h * m - t * n));
                    int y = (int) (height / 2 + 15 * D * (l * h * n + t * m));
                    int o = x + width * y;
                    int N = (int) (8 * ((f * e - c * d * g) * m - c * d * e - f * g - l * d * n));

                    if (height > y && y > 0 && x > 0 && width > x && D > zBuffer[o]) {
                        zBuffer[o] = D;
                        screen[o] = ".,-~:;=!*#$@".charAt(Math.max(N, 0));
                    }
                }
            }

            // Print the screen buffer
            System.out.print("\u001b[H"); // ANSI escape code to reset the cursor
            for (int k = 0; k < screen.length; k++) {
                System.out.print(k % width > 0 ? screen[k] : 10);
            }

            // Increment the rotation angles
            A += 0.04;
            B += 0.02;
        }
    }
}

package Basics.Patterns;

public class Pattern18 {
    public static void main(String[] args) {
        int num = 5;
        pattern18(num);
    }

    /*
        E
        D E
        C D E
        B C D E
        A B C D E
     */
    static void pattern18(int n) {
        // outer loop
        for (int i = 0; i < n; i++) {

            // inner loop
            for (char j = (char)('A' + n - 1 - i); j <= ('A' + n - 1); j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }
}






/*
 for (int i = 0; i < n; i++) {
            for (char ch = (char)(('A' + n - 1) - i); ch <= ('A' + n - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
 */

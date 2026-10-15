package Basics.Patterns;

public class Pattern19 {
    public static void main(String[] args) {
        int num = 5;
        pattern18(num);
    }

    /*
         **********
         ****  ****
         ***    ***
         **      **
         *        *
         *        *
         **      **
         ***    ***
         ****  ****
         **********
     */
    static void pattern18(int n) {
        int spaces = 0;
        // Top half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) System.out.print("*");
            for (int j = 0; j < spaces; j++) System.out.print(" ");
            for (int j = 0; j < n - i; j++) System.out.print("*");
            spaces += 2;
            System.out.println();
        }
        // Bottom half
        spaces = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) System.out.print("*");
            for (int j = 0; j < spaces; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("*");
            spaces -= 2;
            System.out.println();
        }
    }
    }
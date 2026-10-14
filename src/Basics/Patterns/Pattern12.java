package Basics.Patterns;

import static Basics.Patterns.Pattern3.pattern3;

public class Pattern12 {
    public static void main(String[] args) {
        int num = 5;
        pattern12(num);
    }

    /*
        1        1
        12      21
        123    321
        1234  4321
        1234554321
     */
    static void pattern12(int num) {
        int spaces = (2 * num - 2);
        for (int i = 1; i <= num; i++) {

            // print numbers in order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            //print spaces
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }

            // print numbers but in reverse
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            spaces = spaces - 2;
            System.out.println();
        }

    }
}

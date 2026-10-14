package Basics.Patterns;

import static Basics.Patterns.Pattern7.pattern7;
import static Basics.Patterns.Pattern8.pattern8;

public class Pattern9 {
    public static void main(String[] args) {
        int num = 5;
        pattern9(num);
    }

    /*
         *
        ***
       *****
      *******
     *********
     *********
      *******
       *****
        ***
         *
     */
    static void pattern9(int num) {
        pattern7(num);
        pattern8(num);
    }
}

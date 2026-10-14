package Basics.Patterns;

import static Basics.Patterns.Pattern2.pattern2;
import static Basics.Patterns.Pattern5.pattern5;
import static Basics.Patterns.Pattern7.pattern7;
import static Basics.Patterns.Pattern8.pattern8;

public class Pattern10 {
    public static void main(String[] args) {
        int num = 5;
        pattern10(num);
    }

    /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
     */
    static void pattern10(int num) {
        pattern2(num);
        pattern5(num - 1);
    }
}

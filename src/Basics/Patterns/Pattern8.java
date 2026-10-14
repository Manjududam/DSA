package Basics.Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int num = 5;
        pattern8(num);
    }

    /*
     *********
      *******
       *****
        ***
         *
     */
    static void pattern8(int num) {
        for (int i = 0; i < num; i++) {

            // left spaces
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 0; j < (2 * num - 1) - (2 * i); j++) {
                System.out.print("*");
            }

            // right spaces
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}

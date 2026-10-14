package Basics.Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int num = 5;
        pattern7(num);
    }

    /*
         *
        ***
       *****
      *******
     *********
     */
    static void pattern7(int num) {
        for (int i = 1; i <= num; i++) {

            // left print spaces
            for (int space = 0; space < num - i; space++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }

            // right print spaces
            for (int space = 0; space < num - i; space++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}

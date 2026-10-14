package Basics.Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int num = 5;
        pattern5(num);
    }

    /*
     *****
     ****
     ***
     **
     *
     */
    static void pattern5(int num) {
        for (int i = 0; i <= num; i++) {

            for (int j = 0; j < (num - i); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

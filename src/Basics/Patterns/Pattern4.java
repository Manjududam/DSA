package Basics.Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int num = 5;
        pattern4(num);
    }

    /*
    1
    22
    333
    4444
    55555
     */
    static void pattern4(int num) {
        for (int i = 0; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}

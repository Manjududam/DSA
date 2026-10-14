package Basics.Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        int num = 5;
        pattern13(num);
    }

    /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
     */
    static void pattern13(int num) {
        int start = 1;
        for (int i = 0; i < num; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start += 1;
            }

            System.out.println();
        }

    }
}

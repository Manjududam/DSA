package Basics.Patterns;

public class Pattern14 {
    public static void main(String[] args) {
        int num = 5;
        pattern14(num);
    }

    /*
        A
        AB
        ABC
        ABCD
        ABCDE
     */
    static void pattern14(int num) {
        char start = 'A';

        for (int i = 0; i < num; i++) {

            for (char j = start; j <= start + i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}

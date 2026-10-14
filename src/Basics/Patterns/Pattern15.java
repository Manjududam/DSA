package Basics.Patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int num = 5;
        pattern15(num);
    }

    /*
        ABCDE
        ABCD
        ABC
        AB
        A
     */
    static void pattern15(int num) {
        char start = 'A';
        for (int i = 0; i < num; i++) {

            for (char ch = start; ch<='A'+(num- i -1);ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }

    }
}

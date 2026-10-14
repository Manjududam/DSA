package Basics.Patterns;

public class Pattern16 {
    public static void main(String[] args) {
        int num = 5;
        pattern15(num);
    }

    /*
        A
        BB
        CCC
        DDDD
        EEEEE
     */
    static void pattern15(int num) {
        char ch = 'A';
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }

            ch++;
            System.out.println();
        }
    }
}

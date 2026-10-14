package Basics.Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int num = 5;
        pattern6(num);
    }

    /*
        12345
        1234
        123
        12
        1
     */
    static void pattern6(int num) {
        for (int i = 0; i <= num; i++) {

            for (int j = 1; j <= (num - i); j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

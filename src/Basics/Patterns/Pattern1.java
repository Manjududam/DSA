package Basics.Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        int num = 5;
        pattern1(num);
    }

    /*
     *****
     *****
     *****
     *****
     *****
     */
    static void pattern1(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

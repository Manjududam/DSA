package Basics.Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int num = 5;
        pattern17(num);
    }

    /*
            A
           ABA
          ABCBA
         ABCDCBA
        ABCDEDCBA
     */
    static void pattern17(int num) {
        for (int i = 1; i <= num; i++) {

            // spaces
            for (int space = 0; space < num - i; space++) {
                System.out.print(" ");
            }

            char ch = 'A';
            // innner loop
            for (int j = 1; j <= 2 * i - 1; j++) {

                System.out.print(ch);
                if (i > j) ch += 1;
                else ch -= 1;
            }

            System.out.println();
        }
    }
}

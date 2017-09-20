package less1;

import java.util.Scanner;

/**
 * Created by User on 021 21.09.17.
 */
public class Main {
    /*
    && — логическое и
    || — логическое или
    ! — логическое отрицание
    */
    private static int i;
    private static int q;
    private static int w;
    private static int d;
    private static int j;
    private static int f;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        q = 1;
        w = 2;
        d = 3;
        j = 5;
        f = 5;
        i = scanner.nextInt();

        if (i == j && i == f || i == q && i != w) {
            System.out.println("Дорівнює");
        } else {
            if (i <= 10 && q > 0) {
                System.out.println("qqq");
            }
            System.out.println("Не дорівнює");
        }
    }
}

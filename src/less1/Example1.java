package less1;

/**
 * Created by User on 021 21.09.17.
 */
public class Example1 {
    public static void main(String[] args) {
        int result;
        result = checkNumber(6);
        if (result == checkNumber()) {
            System.out.println("Дорівнює:");
        } else {
            System.out.println("Не дорівнює");
        }

        System.out.println(" ");

        int start = 0;
        int finish = 10;
        String result1 = statement(checkNumber(start, finish));
        System.out.println(result1);
    }

    public static String statement(int result) {
        String stringResult;
        if (result >= 10 && result != 20 || result != 9) {
            stringResult = "Tak";
        } else {
            stringResult = "Hi";
        }
        return stringResult;
    }

    public static int checkNumber(int start, int finish) {
        int value = 100;
        for (int i = start; i < finish; i++) {
            value--;
        }
        return value;
    }

    public static int checkNumber(int i) {
        return i;
    }

    public static int checkNumber() {
        int i = 5;
        return i;
    }
}

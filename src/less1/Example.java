package less1;

/**
 * Created by User on 021 21.09.17.
 */
public class Example {
    static int mNumber = 1;
    static int mFinalNumber = 10;
    private static int[] mIntArray = new int[]{1, 2, 3, 4, 6, 4, 4, 5, 3, 4534, 534, 534, 534, 5};
    private static int[] mEmptyIntArray = new int[10];

    public static void main(String[] args) {

        for (int i = 0; i < mFinalNumber; i++) {
            mNumber++;
            System.out.println(mNumber);
            if (mNumber == 8) {
                System.out.println("Stop");
                break;
            }
        }

        /*do {
            mNumber++;
            System.out.println(mNumber);
        } while (mNumber > mFinalNumber);*/

        int q = 0;
        for (int i = 0; i < 10; i++) {
            q++;
            mEmptyIntArray[i] = q;
        }
        System.out.println(" ");

        for (int i = 0; i < mEmptyIntArray.length; i++) {
            if (mEmptyIntArray[i] == mEmptyIntArray.length/*10*/) {
                System.out.println("array is full");
                break;
            } else {
                System.out.println(mEmptyIntArray[i]);
            }
        }

        System.out.println(" ");
        recursiveNumberPicker(1000);
    }

    public static void recursiveNumberPicker(int i) {
        int j;
        j = i/2;
        System.out.println(j);
        if (j <= 10) {
            System.out.println("recursive is completed");
        } else {
            recursiveNumberPicker(j);
        }
    }
}

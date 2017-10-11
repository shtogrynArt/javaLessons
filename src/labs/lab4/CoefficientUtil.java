package labs.lab4;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class CoefficientUtil {

    private static double calculateVariants(int N,
                                            int[] values) {
        int variance = 0;
        double temp;

        for (int i = 0; i < values.length; i++) {
            temp = i;
            variance += temp * temp * values[i];
        }
        return (double) variance / (double) (N);
    }

    //Отримання відхилення для велчини ексцесу
    private static double calculateStandardDeviation(int[] values) {
        double d = 0;
        for (int i = 0; i < values.length; i++) {
            d += pow((values.length / 2), 2);
        }
        return sqrt(d / (values.length - 1));
    }

    //Розрахунок асиметрії
    static double calculateAsymm(int N,
                                 int[] values) {
        double sd = sqrt(calculateVariants(N, values));
        double asymmetry = 0;
        double temp;

        for (int i = 0; i < values.length; i++) {
            temp = (i);
            asymmetry += temp * temp * temp * values[i];
        }
        return (1.0 / (sd * sd * sd * N) * asymmetry);
    }

    //Розрахунок ексцесу
    static double calculateAxcess(int[] values) {
        double st = 0;
        for (int i = 0; i < values.length; i++) {
            st += pow((values.length / 2), 4);
        }
        double res = pow(calculateStandardDeviation(values), 4);
        return st / ((values.length - 1) * res);
    }
}

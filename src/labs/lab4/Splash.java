package labs.lab4;

import java.util.ArrayList;
import java.util.List;

public class Splash {

    private static final int N[] = new int[10];

    private static int[] fillArray() {
        for (int i = 0; i < N.length; i++) {
            N[i] = (int) (5 * Math.random());
        }
        for (int i = 0; i < N.length; i++) {
            int j = N[i];
            //System.out.println(j);
        }
        return N;
    }

    public static void main(String[] args) {
        List<int[]> dispersionValues = new ArrayList<>();
        dispersionValues.add(fillArray());
        System.out.println("Dispersion: ");
        Dispersion.randomize(dispersionValues);
        System.out.println("\nAsymmetric coefficient:");
        System.out.println(CoefficientUtil.calculateAsymm(N.length, N));
        System.out.println("Axcess coefficient:");
        System.out.println(CoefficientUtil.calculateAxcess(N));
        System.out.println("Average squared deviation:");
        Deviation.squaredDeviation(N);
    }
}
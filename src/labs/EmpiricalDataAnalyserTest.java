package labs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpiricalDataAnalyserTest {

    @Test
    public void findArithmeticMeanTest() {
        EmpiricalDataAnalyser emda = new EmpiricalDataAnalyser();
        ArrayList<Integer[]> sequences = new ArrayList<>();
        double[] expectedResults = new double[] {4.333, 5.143, 6.0, 5.333, 3.667};
        double[] actualtResults = new double[expectedResults.length];

        sequences.add(new Integer[] { 2, 4, 6, 4, 2, 8 });
        sequences.add(new Integer[] { 12, 1, 3, 5, 7, 6, 2 });
        sequences.add(new Integer[] { 9, 10, 11, 5, 2, 2, 2, 7 });
        sequences.add(new Integer[] { 12, 11, 2, 4, 2, 1 });
        sequences.add(new Integer[] { 9, 8, 2, 3, 3, 3, 1, 2, 3, 4, 5, 1 });

        for (int i = 0; i < actualtResults.length; i++)
            actualtResults[i] =emda.findArithmeticMean(
                    Arrays.asList(sequences.get(i)));

        System.out.println("Arithmetic Mean Test");
        for (int i = 0; i < actualtResults.length; i++) {
            System.out.println("Sequence: "
                    + Arrays.toString(sequences.get(i)));
            System.out.println("Expected Arithmetic Mean: "
                    + expectedResults[i]);
            System.out.printf("Actual Arithemetic Mean: %.3f\n",
                    actualtResults[i]);
            System.out.println("===========================================");
        }

        for (int i = 0; i < actualtResults.length; i++)
            assertEquals(expectedResults[i], actualtResults[i], .05);
    }

    @Test
    public void findMedianTest() {
        EmpiricalDataAnalyser emda = new EmpiricalDataAnalyser();
        ArrayList<Integer[]> sequences = new ArrayList<>();
        double[] expectedResults = new double[] { 5.0, 1.0, 2.0, 10.0, 3.0 };
        double[] actualtResults = new double[expectedResults.length];

        sequences.add(new Integer[] { 2, 4, 6, 4, 2, 8 });
        sequences.add(new Integer[] { 4, 12, 13, 9, 1, 1, 2, 3, 5 });
        sequences.add(new Integer[] { 10, 12, 9, 1, 3, 4, 5, 2 });
        sequences.add(new Integer[] { 10, 6, 2, 4, 2, 10, 12, 13, 4, 2, 3 });
        sequences.add(new Integer[] { 11, 1, 2, 3, 5, 18, 6 });

        for (int i = 0; i < actualtResults.length; i++)
            actualtResults[i] = emda.findMedian(
                    Arrays.asList(sequences.get(i)));

        System.out.println("### Median Test #######################");
        for (int i = 0; i < actualtResults.length; i++) {
            System.out.println("Sequence: "
                    + Arrays.toString(sequences.get(i)));
            System.out.println("Expected Median: " + expectedResults[i]);
            System.out.printf("Actual Median: %.3f\n", actualtResults[i]);
            System.out.println("===========================================");
        }

        for (int i = 0; i < actualtResults.length; i++)
            assertEquals(expectedResults[i], actualtResults[i], .05);
    }

    @Test
    public void findModeTest() {
        EmpiricalDataAnalyser emda = new EmpiricalDataAnalyser();
        ArrayList<Integer[]> sequences = new ArrayList<>();
        double[] expectedResults = new double[]{4.0, 1.0, 5.0, 2.0, 1.0, 1.5, -1};
        double[] actualtResults = new double[expectedResults.length];

        sequences.add(new Integer[] { 2, 4, 4, 6, 4, 2, 8 });
        sequences.add(new Integer[] { 4, 12, 13, 9, 1, 1, 1, 2, 2, 3, 5 });
        sequences.add(new Integer[] { 10, 12, 9, 1, 3, 4, 5, 5, 2 });
        sequences.add(new Integer[]{10,6, 6, 2, 4, 2, 10, 2, 12, 13, 6, 4, 2, 3});
        sequences.add(new Integer[] { 11, 1, 2, 3, 1, 2, 1, 3, 5, 18, 6 });
        sequences.add(new Integer[] { 1, 1, 2, 2, 3 });
        sequences.add(new Integer[] { 1, 1, 2, 2, 3, 3 });

        for (int i = 0; i < actualtResults.length; i++) {
            actualtResults[i] = emda.findMode(Arrays.asList(sequences.get(i)));
            System.out.println("WRITE"
                    + emda.findMode(Arrays.asList(sequences.get(i))));
        }

        System.out.println("### Mode Test #########################");
        for (int i = 0; i < actualtResults.length; i++) {
            System.out.println("Sequence: "
                    + Arrays.toString(sequences.get(i)));
            System.out.println("Expected Mode: " + expectedResults[i]);
            System.out.println("Actual Mode: " + actualtResults[i]);
            System.out.println("===========================================");
        }

        System.out.println("ACTUAL RESULTS " + Arrays.toString(actualtResults));
        for (int i = 0; i < actualtResults.length; i++)
            assertEquals(expectedResults[i], actualtResults[i], .05);
    }
}


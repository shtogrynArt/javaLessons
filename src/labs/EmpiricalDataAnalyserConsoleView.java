package labs;

public class EmpiricalDataAnalyserConsoleView {

    public static void main(String[] args) {
        int numberOfElements = 20;
        EmpiricalDataAnalyser emda = new EmpiricalDataAnalyser(numberOfElements);

        System.out.println("Data:\t\t\t" + emda.getData());
        System.out.println("Variation row:\t\t" + emda.getVariationRow());
        System.out.println("Mode:\t\t\t" + emda.getMode());
        System.out.println("Media:\t\t\t" + emda.getMedian());
        System.out.println("Arithmetic mean:\t" + emda.getArithmeticMean());
    }

}
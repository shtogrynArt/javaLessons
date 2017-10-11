package labs.lab4;

class Deviation {

    static void squaredDeviation(final int[] values) {
        int sum = 0;
        int max = 0;
        int min = values[0];
        double sd = 0;

        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }

        double average = sum / values.length;

        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }

        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }

        for (int i = 0; i < values.length; i++) {
            sd = sd + Math.pow(values[i] - average, 2);
        }

        double standardDeviation = Math.sqrt(sd / (values.length - 1));

        System.out.println(standardDeviation);
    }
}

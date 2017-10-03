package labs;

import java.util.*;

public class EmpiricalDataAnalyser {

    private final int MAX_IN_RANGE = 20;

    private List<Integer> data;
    private List<Integer> variationRow;
    private double mode;
    private double median;
    private double arithmeticMean;

    EmpiricalDataAnalyser() {
    }

    // Заповнює масив рандомними ел. у проміжку [1, MAX_IN_RANGE]
    EmpiricalDataAnalyser(int numberOfElements) {
        data = new ArrayList<>();
        variationRow = new ArrayList<>();

        for (int i = 0; i < numberOfElements; i++) {
            data.add((int) (Math.random() * MAX_IN_RANGE + 1));
            variationRow.add(data.get(i));
        }

        Collections.sort(variationRow);

        mode = findMode(data);
        median = findMedian(variationRow);
        arithmeticMean = findArithmeticMean(data);
    }

    //Шукає арифметичне значення заданого масиву
    public double findArithmeticMean(List<Integer> data) {
        int sum = 0;
        for (Integer item : data)
            sum += item;
        return (double) sum / (double) data.size();
    }

    //Шукає медіану заданого масиву
    public double findMedian(List<Integer> data) {
        int size = data.size();
        if (size % 2 == 1)
            return data.get(size / 2);
        else
            return (double) (data.get(size / 2 - 1) + data.get(size / 2)) / 2.0;
    }

    //Шукає моду щаданого масиву
    public double findMode(List<Integer> data) {
        HashMap<Integer, Integer> occurances = new HashMap<>();
        double mode = 0.0;
        for (int i = 0; i < data.size(); i++) {
            if (occurances.containsKey(data.get(i)))
                occurances.put(data.get(i), occurances.get(data.get(i)) + 1);
            else
                occurances.put(data.get(i), 1);
        }

        int equalsCounter = 0;
        Integer[] values = Arrays.copyOf(occurances.values().toArray(),
                occurances.values().toArray().length,
                Integer[].class);
        Integer[] keys = Arrays.copyOf(occurances.keySet().toArray(),
                occurances.keySet().toArray().length, Integer[].class);

        int max = values[0];
        for (int i = 0; i < keys.length; i++) {
            if (values[i].compareTo(Integer.valueOf(max)) >= 0) {
                max = values[i];
                mode = keys[i];
            }
        }

        ArrayList<Integer> maxPositions = new ArrayList<>();
        for (int i = 0; i < keys.length; i++) {
            if (values[i].equals(Integer.valueOf(max)))
                maxPositions.add(i);
        }

        if (maxPositions.size() > 2)
            return -1;

        if (maxPositions.size() == 2)
            return (double) (keys[maxPositions.get(0)]
                    + keys[maxPositions.get(1)]) / 2.0;
        return mode;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

    public List<Integer> getVariationRow() {
        return variationRow;
    }

    public void setVariationRow(List<Integer> variationRow) {
        this.variationRow = variationRow;
    }

    public double getMode() {
        return mode;
    }

    public void setMode(double mode) {
        this.mode = mode;
    }

    public double getMedian() {
        return median;
    }

    public void setMedian(double median) {
        this.median = median;
    }

    public double getArithmeticMean() {
        return arithmeticMean;
    }

    public void setArithmeticMean(double arithmeticMean) {
        this.arithmeticMean = arithmeticMean;
    }
}


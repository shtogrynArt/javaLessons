package labs.lab4;


import java.util.ArrayList;
import java.util.List;

class Dispersion {

    public static void randomize(List<int[]> intList) {
        List<int[]> randomizedList = new ArrayList<>();
        List<int[]> tmpSubList = new ArrayList<>(intList);
        int numberOfAttempts = 100;
        while (intList.size() > 0) {
            if (tmpSubList.size() == 0) {
                if (--numberOfAttempts == 0) {
                    return;
                }
                intList.addAll(randomizedList);
                tmpSubList.addAll(randomizedList);
                randomizedList.clear();
            }
            int randomIndex = (int) (tmpSubList.size() * Math.random());
            int[] match = tmpSubList.remove(randomIndex);

            intList.remove(match);
            randomizedList.add(match);

            tmpSubList.clear();
            tmpSubList.addAll(intList);
        }
        intList.addAll(randomizedList);

        for (int i = 0; i < intList.get(0).length; i++) {
            int j = intList.get(0)[i];
            System.out.print("[" + j + "]");
        }
    }
}

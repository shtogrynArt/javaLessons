package less3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Duck> duckArrayList = new ArrayList<>();

        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Duck duck3 = new Duck();

        duckArrayList.add(duck1);
        duckArrayList.add(duck2);
        duckArrayList.add(duck3);

        int counter = 0;
        for (Duck duckHolder : duckArrayList) {
            duckHolder.fly();
            counter++;
            System.out.println(counter);
        }

        System.out.println("");

        System.out.println(duckArrayList.size());

        duckArrayList.remove(1);
        duckArrayList.remove(2);

        if (duckArrayList.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("No empty");
        }
    }
}

package less1.homework;

/**
 * Created by User on 027 27.09.17.
 */
public class JamesBondCar extends Car {

    @Override
    public int drive(int howLong) {
        int distance;
        distance = howLong * 180;
        return distance;
    }

    @Override
    public void start() {
        System.out.println("ss");
    }
}

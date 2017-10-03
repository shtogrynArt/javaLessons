package less1.homework;

/**
 * Created by User on 027 27.09.17.
 */
public class CarOwner {

    public static void main(String[] args) {
        int carDistance;

        Car auto = new JamesBondCar();
        auto.start();
        auto.stop();

        carDistance = auto.drive(10);
        System.out.println(carDistance);
        auto.drive(20);
    }
}

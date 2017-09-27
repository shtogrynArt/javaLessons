package homework;

/**
 * Created by User on 027 27.09.17.
 */
public class CarOwner {
    public static void main(String[] args) {
        int carDistance;
        Car avto = new Car();
        avto.start();
        avto.stop();
        carDistance = avto.drive(10);
        System.out.println(carDistance);
        avto.drive(20);
    }
}

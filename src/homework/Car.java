package homework;

/**
 * Created by User on 027 27.09.17.
 */
public class Car {
    public void start(){
        System.out.println("Стоп");
    }
    public void stop(){
        System.out.println("Старт");
    }
    public int drive(int howLong){
        int distance;
        distance = howLong*60;
        return distance;
    }

}

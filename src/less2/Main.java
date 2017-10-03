package less2;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog(2);
        dog.go();
        dog.makeVoice();
        Dog.blablabla();
        System.out.println(Animal.CONSTANT_ONE);
        String tail = dog.isTail(true);
        System.out.println(dog.getAge());
        System.out.println(tail);
    }
}

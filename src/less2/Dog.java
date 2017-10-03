package less2;

public class Dog extends Animal {

    public Dog(int age) {
        super(age);
    }

    @Override
    protected void makeVoice() {
        System.out.println("GAFF");
    }

    @Override
    protected void go() {
        super.go();
        System.out.println("and\nrun");
    }

    public static void blablabla() {
        System.out.println("BLa BLA BLA");
    }
}

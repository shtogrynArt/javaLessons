package less2;

public abstract class Animal {

    public final int mHeight = 10;

    public static final String CONSTANT_ONE = "dddd";

    private final String yes = "Yes";
    private final String no = "No";

    private int age;
    private String gender;
    private String color;

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }


    protected String isTail(final boolean isTail) {
        return isTail ? yes : no;
    }

    protected abstract void makeVoice();

    protected void go() {
        System.out.println("Go");
    }

    public int getAge() {
        return age;
    }
}

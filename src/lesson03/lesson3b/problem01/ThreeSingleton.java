package lesson03.lesson3b.problem01;

public class ThreeSingleton {
    private static final int MAX_INSTANCES = 3;
    private static int count = 0;
    private static ThreeSingleton[] instances = new ThreeSingleton[MAX_INSTANCES];

    private ThreeSingleton() {
    }

    public static ThreeSingleton getInstance() {
        if (count < MAX_INSTANCES && instances[count] == null) {
            instances[count] = new ThreeSingleton();
            return instances[count++];
        } else {
            System.out.println("The total number of instances already has been reached to " + MAX_INSTANCES);
        }

        return null;
    }

    public static void main(String[] args) {
        ThreeSingleton instance1 = ThreeSingleton.getInstance();
        ThreeSingleton instance2 = ThreeSingleton.getInstance();
        ThreeSingleton instance3 = ThreeSingleton.getInstance();
        ThreeSingleton instance4 = ThreeSingleton.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
        System.out.println(instance4);
    }
}

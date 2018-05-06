package design_patterns.Singleton;

public class Singleton {

    // Singleton with public final field
    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {

    }

    public void leaveTheBuilding() {

    }

    // Singleton with static factory
    private static final Singleton INSTANCE_1 = new Singleton();

    public static Singleton getInstance() {
        return INSTANCE;
    }



}

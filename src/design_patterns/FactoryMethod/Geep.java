package design_patterns.FactoryMethod;

/**
 * Created by CC on 17.12.2017.
 */
public class Geep implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed 50 km/h");
    }

    @Override
    public void stop() {

        System.out.println("Stopped at 5 sec");
    }
}

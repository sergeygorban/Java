package design_patterns.abstract_factory;

/**
 * Created by CC on 17.12.2017.
 */
public class Niva implements Car {

    @Override
    public void drive() {
        System.out.println("Niva drive");
    }

    @Override
    public void stop() {

        System.out.println("Niva stopped");
    }
}

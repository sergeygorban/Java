package design_patterns.builder;

/**
 * Created by CC on 10.12.2017.
 */
public interface Builder {

    abstract void createWheel();
    abstract void createBody();
    abstract void createCar();
    abstract Car getCar();
}

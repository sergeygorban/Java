package design_patterns.builder;

/**
 * Created by CC on 10.12.2017.
 */


// Конкретный построитель

public class MazdaBuilder implements Builder {

    private Car car;

    @Override
    public void createWheel() {
        car.setWheel(new Wheel().setModel("ZXC").setWeight(23));
    }

    @Override
    public void createBody() {
        car.setBody(new Body().setModel("Sport").setWeight(234));
    }

    @Override
    public void createCar() {
        car =  new Car();
    }

    @Override
    public Car getCar() {
        return car;
    }
}

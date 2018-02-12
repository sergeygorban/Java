package design_patterns.abstract_factory;

/**
 * Created by CC on 17.12.2017.
 */
public class RussionFactory implements TransportFactory{


    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}

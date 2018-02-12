package design_patterns.abstract_factory;

/**
 * Created by CC on 17.12.2017.
 */
public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}

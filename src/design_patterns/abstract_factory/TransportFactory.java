package design_patterns.abstract_factory;

/**
 * Created by CC on 17.12.2017.
 */
public interface TransportFactory {

    Car createCar();
    Aircraft createAircraft();
}

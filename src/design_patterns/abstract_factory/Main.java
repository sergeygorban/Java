package design_patterns.abstract_factory;

/**
 * Created by CC on 17.12.2017.
 */
public class Main {

    private static TransportFactory factory;

    public static void main(String[] args) {

        boolean a = true;

        if (a) {
            factory = new RussionFactory();
        } else {
            factory = new USAFactory();
        }


        factory.createAircraft();
        factory.createCar();





    }
}

package design_patterns.FactoryMethod;

/**
 * Created by CC on 17.12.2017.
 */
public class Main {

    public static void main(String[] args) {

        FacMeth facMeth = new FacMeth();
        Car car = facMeth.getCar(RoadType.CITY);

        car.drive();
        car.stop();

    }
}

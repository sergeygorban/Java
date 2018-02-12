package design_patterns.FactoryMethod;

/**
 * Created by CC on 17.12.2017.
 */
public class FacMeth {

    Car car = null;

    public Car getCar(RoadType roadType) {

        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Geep();
                break;
            case GAZON:
                car = new NewGeep();
                break;
        }
        return car;
    }
}

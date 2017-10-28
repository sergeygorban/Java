package design_patterns.abstract_factory;

/**
 * Created by CC on 25.09.2017.
 */
public class Main {

    public static AddressFactory factory;

    public static void main(String[] args) {

        boolean a = true;

        if (a) {
            factory = new USAddressFactory();
        } else {
            factory = new FrenchAddressFactory();
        }

        System.out.println(factory.createAddress().getFullAddress());
        System.out.println(factory.createPhoneNumber().getCountryCode());
    }
}

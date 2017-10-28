package design_patterns.abstract_factory;

/**
 * Created by CC on 25.09.2017.
 */
public class FrenchAddressFactory implements AddressFactory {


    @Override
    public Address createAddress() {
        return new FrenchAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new FrenchPhoneNumber();
    }
}

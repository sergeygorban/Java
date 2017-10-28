package design_patterns.abstract_factory;

/**
 * Created by CC on 25.09.2017.
 */
public class USAddressFactory implements AddressFactory {


    @Override
    public Address createAddress() {
        return new USAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new USPhoneNumber();
    }
}

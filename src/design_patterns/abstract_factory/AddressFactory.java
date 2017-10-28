package design_patterns.abstract_factory;

/**
 * Created by CC on 25.09.2017.
 */
public interface AddressFactory {

    Address createAddress();
    PhoneNumber createPhoneNumber();
}

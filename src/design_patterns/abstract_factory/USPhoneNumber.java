package design_patterns.abstract_factory;

/**
 * Created by CC on 25.09.2017.
 */
public class USPhoneNumber extends PhoneNumber {

    public static final String COUNTRY_CODE = "01";
    public static final int NUMBER_LENGTH = 10;



    @Override
    public String getCountryCode() {
        return COUNTRY_CODE;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {

        if (phoneNumber.length() == NUMBER_LENGTH) {
            super.setPhoneNumber(phoneNumber);
        }
    }
}

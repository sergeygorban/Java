package design_patterns.abstract_factory;

/**
 * Created by CC on 25.09.2017.
 */
public class FrenchAddress extends Address {

    public static final String COUNTRY = "FRANCE";
    public static final String COMMA = ",";

    @Override
    public String getCountry() {
        return COUNTRY;
    }

    @Override
    public String getFullAddress() {
        return getStreet() + EOL_STRING + getCity() + COMMA + SPACE + getRegion() + SPACE +  getPostalCode()
                + EOL_STRING + COUNTRY + EOL_STRING;
    }
}

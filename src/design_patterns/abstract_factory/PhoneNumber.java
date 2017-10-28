package design_patterns.abstract_factory;

// ����������� ���� ����� �������� �� ���������

public abstract class PhoneNumber {

    private String phoneNumber;

    public abstract String getCountryCode();

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        try {
            Long.parseLong(phoneNumber);
            this.phoneNumber = phoneNumber;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}

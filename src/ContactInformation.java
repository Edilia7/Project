public class ContactInformation {

    private int aptUnd;
    private String streetNumber;
    private String streetName;
    private String city;
    private String province;
    private String country;
    private String postalCode;
    private int countryCode;
    private String typeTelephone;
    private String telephone;
    private String email;

    public ContactInformation(int aptUnd, String streetNumber, String streetName, String city, String province, String country, String postalCode) {
        this.aptUnd = aptUnd;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.province = province;
        this.country = country;
        this.postalCode = postalCode;
    }

    public ContactInformation(int countryCode, String typeTelephone, String telephone, String email) {
        this.countryCode = countryCode;
        this.typeTelephone = typeTelephone;
        this.telephone = telephone;
        this.email = email;
    }
}

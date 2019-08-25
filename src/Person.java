public class Person {

    public ID id;
    private String firstName;
    private String middleName;
    private String familytName;
    private Age age;
    private String cityBirth;
    private String provinceBirth;
    private String countryBirth;
    private String nacionality;
    private String sex;
    private double height;
    private String eyeColor;
    private CivilStatus civilStatus;
    private ContactInformation adress;
    private ContactInformation telephone;


    public Person(ID id, String firstName, String middleName, String familytName, Age age, String cityBirth, String provinceBirth, String countryBirth, String nacionality, String sex, double height, String eyeColor, CivilStatus civilStatus, ContactInformation adress, ContactInformation telephone) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.familytName = familytName;
        this.age = age;
        this.cityBirth = cityBirth;
        this.provinceBirth = provinceBirth;
        this.countryBirth = countryBirth;
        this.nacionality = nacionality;
        this.sex = sex;
        this.height = height;
        this.eyeColor = eyeColor;
        this.civilStatus = civilStatus;
        this.adress = adress;
        this.telephone = telephone;
    }
}

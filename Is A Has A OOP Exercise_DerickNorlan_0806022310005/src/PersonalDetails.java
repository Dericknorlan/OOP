public class PersonalDetails extends Persons {
    private String NIM;
    private String name;
    private String personalEmail;
    private String religion;
    private String dateOfBirth;
    private String birthCity;
    private String birthCityName;
    private char gender;
    private String citizenshipAdress;
    private String citizenshipCity;
    private String citizenshipDistrict;
    private String citizenshipVillage;
    private int citizenshipPostalCode;
    private String domicileAddress;
    private String domicileCity;
    private String domicileDistrict;
    private String domicileVillage;
    private int domicilePostalCode;
    private String telephone;
    private String telephone2;
    private String mobile;
    private String mobile2;

    public PersonalDetails() {
    }

    public PersonalDetails(String NIM, String name, String personalEmail, String religion, String dateOfBirth,
            String birthCity, String birthCityName, char gender, String citizenshipAdress, String citizenshipCity,
            String citizenshipDistrict, String citizenshipVillage, int citizenshipPostalCode, String domicileAddress,
            String domicileCity, String domicileDistrict, String domicileVillage, int domicilePostalCode,
            String telephone, String telephone2, String mobile, String mobile2) {
        this.NIM = NIM;
        this.name = name;
        this.personalEmail = personalEmail;
        this.religion = religion;
        this.dateOfBirth = dateOfBirth;
        this.birthCity = birthCity;
        this.birthCityName = birthCityName;
        this.gender = gender;
        this.citizenshipAdress = citizenshipAdress;
        this.citizenshipCity = citizenshipCity;
        this.citizenshipDistrict = citizenshipDistrict;
        this.citizenshipVillage = citizenshipVillage;
        this.citizenshipPostalCode = citizenshipPostalCode;
        this.domicileAddress = domicileAddress;
        this.domicileCity = domicileCity;
        this.domicileDistrict = domicileDistrict;
        this.domicileVillage = domicileVillage;
        this.domicilePostalCode = domicilePostalCode;
        this.telephone = telephone;
        this.telephone2 = telephone2;
        this.mobile = mobile;
        this.mobile2 = mobile2;
    }

    public String getNIM() {
        return this.NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalEmail() {
        return this.personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getReligion() {
        return this.religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBirthCity() {
        return this.birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getBirthCityName() {
        return this.birthCityName;
    }

    public void setBirthCityName(String birthCityName) {
        this.birthCityName = birthCityName;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCitizenshipAdress() {
        return this.citizenshipAdress;
    }

    public void setCitizenshipAdress(String citizenshipAdress) {
        this.citizenshipAdress = citizenshipAdress;
    }

    public String getCitizenshipCity() {
        return this.citizenshipCity;
    }

    public void setCitizenshipCity(String citizenshipCity) {
        this.citizenshipCity = citizenshipCity;
    }

    public String getCitizenshipDistrict() {
        return this.citizenshipDistrict;
    }

    public void setCitizenshipDistrict(String citizenshipDistrict) {
        this.citizenshipDistrict = citizenshipDistrict;
    }

    public String getCitizenshipVillage() {
        return this.citizenshipVillage;
    }

    public void setCitizenshipVillage(String citizenshipVillage) {
        this.citizenshipVillage = citizenshipVillage;
    }

    public int getCitizenshipPostalCode() {
        return this.citizenshipPostalCode;
    }

    public void setCitizenshipPostalCode(int citizenshipPostalCode) {
        this.citizenshipPostalCode = citizenshipPostalCode;
    }

    public String getDomicileAddress() {
        return this.domicileAddress;
    }

    public void setDomicileAddress(String domicileAddress) {
        this.domicileAddress = domicileAddress;
    }

    public String getDomicileCity() {
        return this.domicileCity;
    }

    public void setDomicileCity(String domicileCity) {
        this.domicileCity = domicileCity;
    }

    public String getDomicileDistrict() {
        return this.domicileDistrict;
    }

    public void setDomicileDistrict(String domicileDistrict) {
        this.domicileDistrict = domicileDistrict;
    }

    public String getDomicileVillage() {
        return this.domicileVillage;
    }

    public void setDomicileVillage(String domicileVillage) {
        this.domicileVillage = domicileVillage;
    }

    public int getDomicilePostalCode() {
        return this.domicilePostalCode;
    }

    public void setDomicilePostalCode(int domicilePostalCode) {
        this.domicilePostalCode = domicilePostalCode;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone2() {
        return this.telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile2() {
        return this.mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    public void displayDetails() {
        System.out.println("NIM\t\t\t: " + this.NIM);
        System.out.println("Name\t\t\t: " + this.name);
        System.out.println("Personal Email \t\t: " + this.personalEmail);
        System.out.println("Religion\t\t: " + this.religion);
        System.out.println("Date Of Birth\t\t: " + this.dateOfBirth);
        System.out.println("Birth City\t\t: " + this.birthCity);
        System.out.println("Birth City Name\t\t: " + this.birthCityName);
        System.out.println("Gender\t\t\t: " + this.gender);
        System.out.println("Citizenship Adress\t: " + this.citizenshipAdress);
        System.out.println("Citizenship City\t: " + this.citizenshipCity);
        System.out.println("Citizenship District\t: " + this.citizenshipDistrict);
        System.out.println("Citizenship Village\t: " + this.citizenshipVillage);
        System.out.println("Citizenship Postal Code\t: " + this.citizenshipPostalCode);
        System.out.println("Domicile Address\t: " + this.domicileAddress);
        System.out.println("Domicile City\t\t: " + this.domicileCity);
        System.out.println("Domicile District\t: " + this.domicileDistrict);
        System.out.println("Domicile Village \t: " + this.domicileVillage);
        System.out.println("Domicile Postal Code \t: " + this.domicilePostalCode);
        System.out.println("Telephone \t\t: " + this.telephone);
        System.out.println("Telephone 2 \t\t: " + this.telephone2);
        System.out.println("Mobile \t\t\t: " + this.mobile);
        System.out.println("Mobile 2 \t\t: " + this.mobile2);
    }

    public void displayDetails(String namaVariabel) {
        switch (namaVariabel) {
            case "NIM":
                System.out.println("NIM\t\t\t: " + this.NIM);
            case "name":
                System.out.println("Name\t\t\t: " + this.name);
            case "personalEmail":
                System.out.println("Personal Email \t\t: " + this.personalEmail);
            case "religion":
                System.out.println("Religion\t\t: " + this.religion);
            case "dateOfBirth":
                System.out.println("Date Of Birth\t\t: " + this.dateOfBirth);
            case "birthCity":
                System.out.println("Birth City\t\t: " + this.birthCity);
            case "birthCityName":
                System.out.println("Birth City Name\t\t: " + this.birthCityName);
            case "gender":
                System.out.println("Gender\t\t\t: " + this.gender);
            case "citizenshipAdress":
                System.out.println("Citizenship Adress\t: " + this.citizenshipAdress);
            case "citizenshipCity":
                System.out.println("Citizenship City\t: " + this.citizenshipCity);
            case "citizenshipDistrict":
                System.out.println("Citizenship District\t: " + this.citizenshipDistrict);
            case "citizenshipVillage":
                System.out.println("Citizenship Village\t: " + this.citizenshipVillage);
            case "citizenshipPostalCode":
                System.out.println("Citizenship Postal Code\t: " + this.citizenshipPostalCode);
            case "domicileAddress":
                System.out.println("Domicile Address\t: " + this.domicileAddress);
            case "domicileCity":
                System.out.println("Domicile City\t\t: " + this.domicileCity);
            case "domicileDistrict":
                System.out.println("Domicile District\t: " + this.domicileDistrict);
            case "domicileVillage":
                System.out.println("Domicile Village \t: " + this.domicileVillage);
            case "domicilePostalCode":
                System.out.println("Domicile Postal Code \t: " + this.domicilePostalCode);
            case "telephone":
                System.out.println("Telephone \t\t: " + this.telephone);
            case "telephone2":
                System.out.println("Telephone 2 \t\t: " + this.telephone2);
            case "mobile":
                System.out.println("Mobile \t\t\t: " + this.mobile);
            case "mobile2":
                System.out.println("Mobile 2 \t\t: " + this.mobile2);
        }
    }
}

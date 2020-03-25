package gocer.efekan.tpfinal.Model;

public class Country {
    private String countryName;
    private String countryCode;
    private String countryCapital;
    private int countryFlag;

    public Country(String countryName, String countryCode, String countryCapital, int countryFlag) {
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.countryCapital = countryCapital;
        this.countryFlag = countryFlag;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }

    public int getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(int countryFlag) {
        this.countryFlag = countryFlag;
    }

    @Override
    public String toString() {
        return "Country{" + "countryName: " + countryName
                + "countryCode: " + countryCode
                + "countryCapital: " + countryCapital;
    }
}

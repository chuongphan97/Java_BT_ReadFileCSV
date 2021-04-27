import java.io.*;

public class Country implements Serializable {
    private String startIp;
    private String endIp;
    private String starCode;
    private String endCode;
    private String countryCode;
    private String countryName;

    public Country(String startIp, String endIp, String starCode, String endCode, String countryCode, String countryName) {
        this.startIp = startIp;
        this.endIp = endIp;
        this.starCode = starCode;
        this.endCode = endCode;
        this.countryCode = countryCode;
        this.countryName = countryName;
    }

    public String getStartIp() {
        return startIp;
    }

    public void setStartIp(String startIp) {
        this.startIp = startIp;
    }

    public String getEndIp() {
        return endIp;
    }

    public void setEndIp(String endIp) {
        this.endIp = endIp;
    }

    public String getStarCode() {
        return starCode;
    }

    public void setStarCode(String starCode) {
        this.starCode = starCode;
    }

    public String getEndCode() {
        return endCode;
    }

    public void setEndCode(String endCode) {
        this.endCode = endCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return startIp + ", " +
                endIp + ", " +
                starCode + ", " +
                endCode + ", " +
                countryCode +", " +
                countryName + "\n";
    }
}

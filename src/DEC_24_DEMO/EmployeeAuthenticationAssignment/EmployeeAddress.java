package DEC_24_DEMO.EmployeeAuthenticationAssignment;

import java.util.Objects;

public class EmployeeAddress {
    private String streetNo;
    private String streetName;
    private String cityName;
    private String province;
    private String country;

    public EmployeeAddress(String streetNo, String streetName, String cityName, String province, String country) {
        this.streetNo = streetNo;
        this.streetName = streetName;
        this.cityName = cityName;
        this.province = province;
        this.country = country;
    }

    public EmployeeAddress() {
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeAddress that = (EmployeeAddress) o;
        return Objects.equals(getStreetNo(), that.getStreetNo()) && Objects.equals(getStreetName(), that.getStreetName()) && Objects.equals(getCityName(), that.getCityName()) && Objects.equals(getProvince(), that.getProvince()) && Objects.equals(getCountry(), that.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStreetNo(), getStreetName(), getCityName(), getProvince(), getCountry());
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "streetNo='" + streetNo + '\'' +
                ", streetName='" + streetName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

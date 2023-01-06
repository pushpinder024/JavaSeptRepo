package DEC_22_DEMO.MakingClassesInmutableInHashMap;

import java.util.Objects;

public class AddressClass {
    private String cityName;

    public AddressClass(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressClass that = (AddressClass) o;
        return Objects.equals(getCityName(), that.getCityName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCityName());
    }

    @Override
    public String toString() {
        return "AddressClass{" +
                "cityName='" + cityName + '\'' +
                '}';
    }
}

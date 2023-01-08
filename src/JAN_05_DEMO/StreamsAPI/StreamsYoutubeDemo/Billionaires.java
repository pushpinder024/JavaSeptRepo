package JAN_05_DEMO.StreamsAPI.StreamsYoutubeDemo;

import java.util.Objects;

public class Billionaires {
    private String name;
    private int billions;

    public Billionaires(String name, int billions) {
        this.name = name;
        this.billions = billions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBillions() {
        return billions;
    }

    public void setBillions(int billions) {
        this.billions = billions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Billionaires that = (Billionaires) o;
        return getBillions() == that.getBillions() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBillions());
    }

    @Override
    public String toString() {
        return "Billionaires{" +
                "name='" + name + '\'' +
                ", billions=" + billions +
                '}';
    }
}

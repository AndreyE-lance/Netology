package task433;

import java.util.Objects;

public class Transport {
    private String number;
    private String model;
    private String color;
    private String type;

    public Transport(String number, String model, String color, String type) {
        this.number = number;
        this.model = model;
        this.color = color;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Transport transport = (Transport) o;
        return number.equals(transport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return number + ", " +
                model + ", " +
                color;
    }
}

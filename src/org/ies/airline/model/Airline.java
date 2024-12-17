package org.ies.airline.model;

import java.util.Arrays;
import java.util.Objects;

public class Airline {

    private String name;
    private Airline[] airlines;

    public Airline(String name, Airline[] airlines) {
        this.name = name;
        this.airlines = airlines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name) && Objects.deepEquals(airlines, airline.airlines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(airlines));
    }
}

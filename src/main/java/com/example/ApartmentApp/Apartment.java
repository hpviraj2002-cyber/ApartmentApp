package com.example.ApartmentApp;

import java.util.Arrays;
import java.util.Objects;

public class Apartment
{
    private String name;
    private String owner;
    private String address;
    private Flat[] flats;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Apartment apartment)) return false;
        return Objects.equals(name, apartment.name) && Objects.equals(owner, apartment.owner) && Objects.equals(address, apartment.address) && Objects.deepEquals(flats, apartment.flats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, owner, address, Arrays.hashCode(flats));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void setFlats(Flat[] flats) {
        this.flats = flats;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", address='" + address + '\'' +
                ", flats=" + Arrays.toString(flats) +
                '}';
    }
}

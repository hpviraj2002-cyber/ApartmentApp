package com.example.ApartmentApp;

import java.util.Arrays;
import java.util.Objects;

public class Flat {
    private String flatId;
    private int floor;
    private int rent;
    private Person[] persons;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Flat flat)) return false;
        return floor == flat.floor && rent == flat.rent && Objects.equals(flatId, flat.flatId) && Objects.deepEquals(persons, flat.persons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flatId, floor, rent, Arrays.hashCode(persons));
    }

    public String getFlatId() {
        return flatId;
    }

    public void setFlatId(String flatId) {
        this.flatId = flatId;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "flatId='" + flatId + '\'' +
                ", floor=" + floor +
                ", rent=" + rent +
                ", persons=" + Arrays.toString(persons) +
                '}';
    }
}

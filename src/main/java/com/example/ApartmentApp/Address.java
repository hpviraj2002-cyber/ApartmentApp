package com.example.ApartmentApp;

import lombok.*;

import java.util.Objects;

public class Address {
    private String doorNo;
    private String floor;
    private String cross;
    private String mainRoad;
    private String are;
    private String city;
    private String state;
    private int pinCode;

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getCross() {
        return cross;
    }

    public void setCross(String cross) {
        this.cross = cross;
    }

    public String getMainRoad() {
        return mainRoad;
    }

    public void setMainRoad(String mainRoad) {
        this.mainRoad = mainRoad;
    }

    public String getAre() {
        return are;
    }

    public void setAre(String are) {
        this.are = are;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Address address)) return false;
        return pinCode == address.pinCode && Objects.equals(doorNo, address.doorNo) && Objects.equals(floor, address.floor) && Objects.equals(cross, address.cross) && Objects.equals(mainRoad, address.mainRoad) && Objects.equals(are, address.are) && Objects.equals(city, address.city) && Objects.equals(state, address.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doorNo, floor, cross, mainRoad, are, city, state, pinCode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNo='" + doorNo + '\'' +
                ", floor='" + floor + '\'' +
                ", cross='" + cross + '\'' +
                ", mainRoad='" + mainRoad + '\'' +
                ", are='" + are + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}

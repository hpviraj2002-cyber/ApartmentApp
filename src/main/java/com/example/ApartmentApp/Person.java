package com.example.ApartmentApp;

import java.time.LocalDate;
import java.time.Period;

class Person {

    private String name;
    private LocalDate dob;
    private String phoneNo;
    private int salary;
    private String gender;
    private String state;
    private String city;
    private String flatFloor;


    public Person(String name, LocalDate dob, String phoneNo, int salary,
                  String gender, String city, String state, String flatFloor) {
        this.name = name;
        this.dob = dob;
        this.phoneNo = phoneNo;
        this.salary = salary;
        this.gender = gender;
        this.city = city;
        this.state = state;
        this.flatFloor = flatFloor;
    }

    public double calculateTax() {
        double tax = salary * 10 / 100;

        return tax;
    }

    public double calculateTax(int taxSlab) {
        double tax = salary * taxSlab / 100;
        return tax;
    }

    public int calculateAge() {

        return Period.between(dob, LocalDate.now()).getYears();
    }

    public char lastdigphoneno()
    {
        char ldp;
        ldp = phoneNo.charAt(9);
        return ldp;
    }

    public void lastdigEvenOrOdd()
    {


    }



    public String introduce() {
        String introducingMsg = "";

        // Hello I am Mr Viraj and i am 22 years old and I pay tax of Ruppees
        // 10000.

        double tax = calculateTax();
        int age = calculateAge();

        if (gender.equalsIgnoreCase("Male")) {
            introducingMsg = "Hello I am Mr " + name + " from " + city + ", " + state + " and I am " + age
                    + " years old and I pay tax of Ruppees " + tax;
        } else {
            introducingMsg = "Hello I am Mrs " + name + " from " + city+ ", " + state + " and I am " + age
                    + " years old and I pay tax of Ruppees " + tax;
        }

        return introducingMsg;
    }


    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Phone: " + phoneNo);
        System.out.println("Salary: " + salary);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("My Flat is in : " + flatFloor +" floor.");

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dob == null) ? 0 : dob.hashCode());
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
        result = prime * result + salary;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (dob == null) {
            if (other.dob != null)
                return false;
        } else if (!dob.equals(other.dob))
            return false;
        if (gender == null) {
            if (other.gender != null)
                return false;
        } else if (!gender.equals(other.gender))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (phoneNo == null) {
            if (other.phoneNo != null)
                return false;
        } else if (!phoneNo.equals(other.phoneNo))
            return false;
        if (salary != other.salary)
            return false;
        return true;
    }

}


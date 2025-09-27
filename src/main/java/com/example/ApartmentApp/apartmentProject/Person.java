package com.example.ApartmentApp.apartmentProject;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Person  implements Comparable{

    private String name;
    private LocalDate dob;
    private String phoneNo;
    private int salary;
    private String gender;
    private Address address;
    private boolean isElder;



    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Person(String name, LocalDate dob, String phoneNo, int salary, String gender, Address address, boolean isElder) {
        this.name = name;
        this.dob = dob;
        this.phoneNo = phoneNo;
        this.salary = salary;
        this.gender = gender;
        this.address = address;
        this.isElder = isElder;
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

    public void phoneNumberEndsWithEvenOrOdd()
    {
        int phoneNoLen = phoneNo.length();
        char c = phoneNo.charAt(phoneNoLen - 1);
        String s = String.valueOf(c);
        int d = Integer.parseInt(s);
        if(d%2 == 0)
            System.out.println("Phone number Ends with Even ");
        else
            System.out.println("Phone number Ends with Odd ");

    }



    public String introduce() {
        String introducingMsg = ""; // assignement

        double tax = calculateTax();
        int age = calculateAge();

        if (gender.equalsIgnoreCase("Male")) {
            introducingMsg = "Hello I am Mr " + name + " from  and I am " + age
                    + " years old and I pay tax of Ruppees " + tax;
        } else {
            introducingMsg = "Hello I am Mrs " + name + " from and I am " + age
                    + " years old and I pay tax of Ruppees " + tax;
        }

        return introducingMsg;
    }


    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Phone: " + phoneNo);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);

    }

    public String getNameAndAge(){
        String nameAge = null;

        if(name.equals("chirag"))
            nameAge = null;
        else
            nameAge = name + 22;

        return nameAge;
    }

    public String getFloor(){
        String floor = address.getFloor();
        return floor;
    }


    public void TotalMarksPercentage()
    {
        int totalmarks = 0;
        float percentage;

        int[] arr1 = new int[5];
        int a1;
        for(int i =0;i<5;i++)
        {
            Scanner scan = new Scanner(System.in);
            a1 = scan.nextInt();
            arr1 [i] = a1;

        }
        for(int i =0;i<5;i++)
        {
            totalmarks = totalmarks + arr1[i];
        }

        percentage = ((float)totalmarks/ arr1.length);
        System.out.println("Total marks obtained by " + name + ":" + totalmarks);
        System.out.println("Percentage obtained by " + name + ":" + percentage+"%");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", phoneNo='" + phoneNo + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                ", isElder=" + isElder +
                '}';

        //return "person hesru = "+name+" avanau ee date alli huttida " + dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isElder() {
        return isElder;
    }

    public void setElder(boolean elder) {
        isElder = elder;
    }

    @Override
    public int compareTo(Object o) {

        Person p1 = this;
        Person p2 = (Person) o;
        return -(p1.getName().compareTo(p2.getName()));

    }
}





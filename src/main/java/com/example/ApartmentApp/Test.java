package com.example.ApartmentApp;

import com.example.ApartmentApp.apartmentProject.Address;
import com.example.ApartmentApp.apartmentProject.Person;

import java.time.LocalDate;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] xyz) {
		// System.out.println("Chiragggggg");

		 Person p11 = new Person("Viraj", 1000);
		 Person p21 = new Person("Viraj", 1000);
         //Person p21 = p11;


		 System.out.println("p1 = "+p11);
		 System.out.println("p2 = "+p21);
		 System.out.println(p11 == p21);

		// System.out.println(p1.equals(p2));

		// System.out.println(p1);

		// System.out.println("----------------------------------");
        Address add1 = new Address();
        add1.setDoorNo("123");
        add1.setFloor("1st");
        add1.setCross("1st");
        add1.setMainRoad("1st");
        add1.setAre("MCC B Block");
        add1.setCity("DVg");
        add1.setState("Karnataka");
        add1.setPinCode(577004);
		Person p = new Person("H P Viraj", LocalDate.of(2002, 03, 11),
				"9876543210", 120000, "Male", add1, false);

		p.showDetails();
		System.out.println("Age: " + p.calculateAge());
		System.out.println("Tax (10%): " + p.calculateTax());
		System.out.println("Tax (20% slab): " + p.calculateTax(20));
		System.out.println("Last Digit of Phone Number: " + p.lastdigphoneno());
		String introducingMsg = p.introduce();
		System.out.println(p.introduce());
        p.phoneNumberEndsWithEvenOrOdd();
        p.TotalMarksPercentage();

		System.out.println("-----------------------------------------------------------------------------------------------------------");

        Address add2 = new Address();
        add2.setDoorNo("6729");
        add2.setFloor("6th");
        add2.setCross("1st");
        add2.setMainRoad("1st");
        add2.setAre("Nituvalli");
        add2.setCity("DVg");
        add2.setState("Karnataka");
        add2.setPinCode(577004);

		Person p1 = new Person("Meenakka P", LocalDate.of(1980, 02, 02),
				"9876543215", 520000, "Female", add2, true);
		p1.showDetails();
		System.out.println("Age: " + p1.calculateAge());
		System.out.println("Tax (10%): " + p1.calculateTax());
		System.out.println("Tax (20% slab): " + p1.calculateTax(20));

		System.out.println("Last Digit of Phone Number: " + p1.lastdigphoneno());
		System.out.println(p1.introduce());
        p1.phoneNumberEndsWithEvenOrOdd();
        p1.TotalMarksPercentage();


		System.out.println("------------------------------------------------------------------------------------------------------");


        Address add3 = new Address();
        add3.setDoorNo("756");
        add3.setFloor("2nd");
        add3.setCross("8th");
        add3.setMainRoad("1st");
        add3.setAre("Nituvalli");
        add3.setCity("DVg");
        add3.setState("Karnataka");
        add3.setPinCode(577004);
		
		Person p2 = new Person("Chirag P", LocalDate.of(2005, 03, 16),
				"9876543215", 820000, "Male", add3, true);
		p2.showDetails();
		System.out.println("Age: " + p2.calculateAge());
		System.out.println("Tax (10%): " + p2.calculateTax());
		System.out.println("Tax (20% slab): " + p2.calculateTax(20));
		System.out.println("Last Digit of Phone Number: " + p2.lastdigphoneno());
		System.out.println(p2.introduce());
        p2.phoneNumberEndsWithEvenOrOdd();
        p2.TotalMarksPercentage();
		System.out.println("-------------------------------------------------------------------------------------------------------------");



    }
}

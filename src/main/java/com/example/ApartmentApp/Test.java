package com.example.ApartmentApp;

import java.time.LocalDate;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] xyz) {
		// System.out.println("Chiragggggg");

		// Person p1 = new Person("Viraj", 22);
		// Person p2 = new Person("Viraj", 23);

		// System.out.println("p1 = "+p1);
		// System.out.println("p2 = "+p2);
		// System.out.println(p1 == p2);

		// System.out.println(p1.equals(p2));

		// System.out.println(p1);

		// System.out.println("----------------------------------");
		Person p = new Person("H P Viraj", LocalDate.of(2002, 03, 11),
				"9876543210", 120000, "Male", "Davanagere", "Karnataka", "4th");

		p.showDetails();
		System.out.println("Age: " + p.calculateAge());
		System.out.println("Tax (10%): " + p.calculateTax());
		System.out.println("Tax (20% slab): " + p.calculateTax(20));
		System.out.println("Last Digit of Phone Number: " + p.lastdigphoneno());

		String introducingMsg = p.introduce();
		System.out.println(p.introduce());
		System.out.println("-----------------------------------------------------------------------------");

		Person p1 = new Person("Meenakka P", LocalDate.of(1980, 02, 02),
				"9876543215", 520000, "Female", "Davanagere" , "Karnataka", "3rd");
		p1.showDetails();
		System.out.println("Age: " + p1.calculateAge());
		System.out.println("Tax (10%): " + p1.calculateTax());
		System.out.println("Tax (20% slab): " + p1.calculateTax(20));
		System.out.println("Last Digit of Phone Number: " + p1.lastdigphoneno());
		System.out.println(p1.introduce());
		System.out.println("-----------------------------------------------------------------------------");
		
		Person p2 = new Person("Chirag P", LocalDate.of(2005, 03, 16),
				"9876543214", 820000, "Male", "Davanagere" , "Karnataka", "8th");
		p2.showDetails();
		System.out.println("Age: " + p2.calculateAge());
		System.out.println("Tax (10%): " + p2.calculateTax());
		System.out.println("Tax (20% slab): " + p2.calculateTax(20));
		System.out.println("Last Digit of Phone Number: " + p2.lastdigphoneno());
		System.out.println(p2.introduce());
		System.out.println("-----------------------------------------------------------------------------");
	}
}

package com.example.ApartmentApp.collectionDemos;

import com.example.ApartmentApp.apartmentProject.Address;
import com.example.ApartmentApp.apartmentProject.Person;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class PersonCollectionDemo {
    public static void main(String[] args) {
        Set<Person> personSet = new TreeSet<>(new PersonNameComparator());
        personSet.add(new Person("Sachin", LocalDate.of(1953, 01,01),"6366192546",25000,"Male",new Address(), false));
        personSet.add(new Person("Anjaliiii", LocalDate.of(1968, 01,01),"6366192546",60000,"Male",new Address(), false));
        personSet.add(new Person("Arjun", LocalDate.of(2000, 01,01),"6366192546",7000,"Male",new Address(), false));


        personSet.forEach(person -> System.out.println(person));


    }
}

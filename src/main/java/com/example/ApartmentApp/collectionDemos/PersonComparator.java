package com.example.ApartmentApp.collectionDemos;

import com.example.ApartmentApp.apartmentProject.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        Person p1 = (Person) o1;
        Person p2 = (Person) o2;

        if(p1.getSalary() > p2.getSalary()){
            return -1;
        }
        else if(p1.getSalary() < p2.getSalary())
            return 1;
        return 0;
    }
}

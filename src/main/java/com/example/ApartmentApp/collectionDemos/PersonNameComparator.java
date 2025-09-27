package com.example.ApartmentApp.collectionDemos;

import com.example.ApartmentApp.apartmentProject.Person;

import java.util.Comparator;

public class PersonNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        Person p1 = (Person) o1;
        Person p2 = (Person) o2;

        if (p1.getName().length() > p2.getName().length()) {
            return 1;
        } else if (p1.getName().length() < p2.getName().length())
            return -1;
        return 0;
    }
}

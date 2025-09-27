package com.example.ApartmentApp.collectionDemos;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Viraj");
        list.add("Chirag");
        list.add("Rithesh");
        list.add("chirag");

        System.out.println(list);

        Set<String> set = new HashSet<>(list);
        System.out.println(set);

        Set<String> treeSet = new TreeSet<>(list);
        System.out.println(treeSet);


    }
}

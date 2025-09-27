package com.example.ApartmentApp.collectionDemos;

import java.util.HashMap;
import java.util.Map;

public class MapDemo
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        Integer one = map.put("one", 1);
        System.out.println(one);
        Integer one1 = map.put("one", 11);
        System.out.println(one1);
        Integer two = map.put("two", 12);
        System.out.println(two);
        Integer one2 = map.put("one", 13);
        System.out.println(one2);
        Integer one3 = map.put("one", 15);
        System.out.println(one3);
        Integer three = map.put("three", 14);
        System.out.println(three);
        Integer three2 = map.put("three", 9999);
        System.out.println(three2);



    }
}

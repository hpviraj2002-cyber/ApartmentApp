package com.example.ApartmentApp;

import com.example.ApartmentApp.apartmentProject.Person;

public class Test2 {
    int i = 0;
    public static void main(String[] args) {
        Test2 t = new Test2();
        while(true){
            Person p = new Person("",1);
            t.sample();
        }
    }

    public void sample(){
        System.out.println("sample - "+i);
        i++;
        //sample();
    }
}

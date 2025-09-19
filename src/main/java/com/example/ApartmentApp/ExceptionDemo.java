package com.example.ApartmentApp;

public class ExceptionDemo {

    public static void main(String[] args) {
        Person p1 = new Person("Viraj", 22);
        Person p2 = new Person("chirag", 19);

        String nameAge1 = p1.getNameAndAge();
        String nameAge2 = p2.getNameAndAge();

        try{
            System.out.println("nameAge1 length = "+nameAge1.length());
            System.out.println("nameAge2 length = "+nameAge2.length());
        }catch(StackOverflowError e){
            System.out.println("Nall value");
        }catch(NullPointerException e){
            System.out.println("Nall value");
        }

    }
}

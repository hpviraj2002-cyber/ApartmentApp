package com.example.ApartmentApp;

import java.time.LocalDate;
import java.util.*;

public  class ApartmentTest {

    static Apartment app = new Apartment();

    public static Apartment getApartment()
    {

        app.setName("Lake View");
        app.setOwner("Chirag P");
        app.setAddress("#3729/A2 13th main 6th cross Kuvempunagara");

        Flat [] flats = new Flat[5];
        Flat f1 = new Flat();
        f1.setFloor(3);
        f1.setFlatId("101");
        f1.setRent(19500);

        Person[] persons1 = new Person[2];
        Person p1 = new Person("H P VIRAJ", LocalDate.now(),"6366192546",25000,"Male",new Address());
        Person p2 = new Person("Chirag P", LocalDate.now(),"6366195546",28000,"Male",new Address());
        persons1[0]= p1;
        persons1[1]= p2;


        f1.setPersons(persons1);

        Flat f2 = new Flat();
        f2.setFloor(3);
        f2.setFlatId("102");
        f2.setRent(5500);

        Person[] persons2 = new Person[2];
        Person p3 = new Person("Rithesh", LocalDate.now(),"6366192546",25000,"Male",new Address());
        Person p4 = new Person("Veeresh", LocalDate.now(),"6366195546",28000,"Male",new Address());
        persons2[0]= p3;
        persons2[1]= p4;
        f2.setPersons(persons2);

        Flat f3 = new Flat();
        f3.setFloor(4);
        f3.setFlatId("103");
        f3.setRent(45000);

        Person[] persons3 = new Person[2];
        Person p5 = new Person("Nithin", LocalDate.now(),"6366192546",25000,"Male",new Address());
        Person p6 = new Person("Adharash", LocalDate.now(),"6366195546",28000,"Male",new Address());
        persons3[0]= p5;
        persons3[1]= p6;
        f3.setPersons(persons3);

        Flat f4 = new Flat();

        f4.setFloor(1);
        f4.setFlatId("104");
        f4.setRent(45000);

        Person[] persons4 = new Person[2];
        Person p7 = new Person("Virat", LocalDate.now(),"6366192546",25000,"Male",new Address());
        Person p8 = new Person("Anushka", LocalDate.now(),"6366195546",28000,"Female",new Address());
        persons4[0]= p7;
        persons4[1]= p8;
        f4.setPersons(persons4);

        Flat f5 = new Flat();

        f5.setFloor(2);
        f5.setFlatId("104");
        f5.setRent(5500);

        Person[] persons5 = new Person[2];
        Person p9 = new Person("Sachin", LocalDate.now(),"6366192546",25000,"Male",new Address());
        Person p10 = new Person("Anjali", LocalDate.now(),"6366195546",28000,"Female",new Address());
        persons5[0]= p9;
        persons5[1]= p10;
        f5.setPersons(persons5);

        flats[0] = f1;
        flats[1] = f2;
        flats[2] = f3;
        flats[3] = f4;
        flats[4] = f5;

        app.setFlats(flats);


        return app;
    }

    public static int calculateTotalRent()
    {
        //step1 inside appartment
        //step2 inside flat
        //step3 get rent from flat
        //Apartment app = getApartment();
        Flat[] flats = app.getFlats();
        int totalRent = 0;
        for(int i=0;i< flats.length;i++)
        {
            Flat f = flats[i];
            int r = f.getRent();
            totalRent= totalRent + r;

            //totalRent = totalRent + flats[i].getRent();


        }
        return totalRent;

    }
    public static int totalNoOfFlats()
    {
        Flat[] flats = app.getFlats();
        int noOfFlats = flats.length;// directly return flats.length
        return noOfFlats;
    }
    public static int highestPayingRent()
    {
        int highestRent = 0;
        Flat[] flats = app.getFlats();
        for (int i = 0; i < flats.length ; i++)
        {
            if(flats[i].getRent() > highestRent)
            {
                highestRent = flats[i].getRent();
            }

        }
        return highestRent;

    }
    public static String flatPayingHighestRent()
    {
        String highestPayingRentFlat = null;
        Flat[] flats = app.getFlats();
        int highestPayingRent = highestPayingRent();
        for (int i = 0; i <flats.length ; i++)
        {
            if(highestPayingRent == flats[i].getRent())
            {
                highestPayingRentFlat = flats[i].getFlatId();
            }

        }

        return highestPayingRentFlat;
    }
    public static String[] flatPayingHighestRent_array()
    {
        String[] highestPayingFlats = new String[5];
        int j =0;
        String highestPayingRentFlat = null;
        Flat[] flats = app.getFlats();
        int highestPayingRent = highestPayingRent();
        for (int i = 0; i <flats.length ; i++)
        {
            if(highestPayingRent == flats[i].getRent())
            {
                highestPayingFlats[j] = flats[i].getFlatId();
                j++;
            }

        }

        return highestPayingFlats;
    }

    public static List<String> flatPayingHighestRent_collection() {
        List<String>  highestPayingFlatsList = new ArrayList<>();
        String highestPayingRentFlat = null;
        Flat[] flats = app.getFlats();
        int highestPayingRent = highestPayingRent();
        for (int i = 0; i < flats.length; i++)
        {
            if (highestPayingRent == flats[i].getRent())
            {
               highestPayingFlatsList.add(flats[i].getFlatId());//
            }
        }
        return highestPayingFlatsList;
    }

    public static int[] getAllFloors_array()
    {
        int[] availableflats = new int[5];
        int j = 0;
        Apartment app = getApartment();
        Flat[] flats = app.getFlats();
        for (int i = 0; i < flats.length; i++)
        {
            int floor = flats[i].getFloor();
            availableflats[j] = floor;
            j++;
        }

        return availableflats;

    }

    public static Set<Integer> getAllFloors_collections()
    {
        Set<Integer> availableflats = new TreeSet<>();
        Apartment app = getApartment();
        Flat[] flats = app.getFlats();
        for (int i = 0; i < flats.length; i++)
        {
            int floor = flats[i].getFloor();
            boolean add = availableflats.add(floor);
            System.out.println(add);

        }

        return availableflats;

    }




    public static void main(String[] args)
    {
        getApartment();
        int totalRent = calculateTotalRent();
        int totalNoOfFlats1 = totalNoOfFlats();
        int highestPayingRent1 = highestPayingRent();
        String highestPayingRentFlatId1 = flatPayingHighestRent();
        String[] highestPayingRentFlatId2 = flatPayingHighestRent_array();
        List<String> highestPayingRentFlatId3 = flatPayingHighestRent_collection();
        int[] allFloors = getAllFloors_array();
        Set<Integer> allFloors2  = getAllFloors_collections();
        Map<String, Integer> flatsWithRent = getFlatsWithRent();
        Map<String, Flat> flatsWithId = getFlatsWithId();
        System.out.println("TotalRent = " + totalRent);
        System.out.println("Total No Of Flats = " + totalNoOfFlats1 );
        System.out.println("Highest Paying Rent Amount = " + highestPayingRent1 );
        System.out.println("Flat Paying Highest Rent Normal = " +  highestPayingRentFlatId1 );
        System.out.println("Flat Paying Highest Rent  Array = " + Arrays.toString(highestPayingRentFlatId2));
        System.out.println("Flat Paying Highest Rent Collection  = " + highestPayingRentFlatId3);
        System.out.println("Available Floors Arrays  = " + Arrays.toString(allFloors));
        System.out.println("Available Floors Collections  = " + allFloors2);
        System.out.println("Falts With Rent Map : ");
        System.out.println(flatsWithRent);

        System.out.println();
        System.out.println("Flats details");
        for (Map.Entry<String, Flat> entry : flatsWithId.entrySet()){
            System.out.println(entry.getKey() +" ----- "+entry.getValue());
        }
    }

    public static Map<String, Integer> getFlatsWithRent()
    {
        Map<String, Integer> flatsWithRent = new HashMap<>();

        Apartment apartment = getApartment();
        Flat[] flats = apartment.getFlats();

        for (int i = 0; i < flats.length; i++) {
            String flatId = flats[i].getFlatId();
            int rent = flats[i].getRent();

            flatsWithRent.put(flatId, rent);
        }

        return flatsWithRent;
    }

    public static Map<String, Flat> getFlatsWithId()
    {
        Map<String, Flat> flatsWithIdMap = new HashMap<>();

        Apartment apartment = getApartment();
        Flat[] flats = apartment.getFlats();

        for (int i = 0; i < flats.length; i++) {
            String flatId = flats[i].getFlatId();
            int rent = flats[i].getRent();

            Flat replacedFlat = flatsWithIdMap.put(flatId, flats[i]);
            System.out.println(replacedFlat);
        }

        return flatsWithIdMap;
    }
}

// count total no of flats in the apartment.
// find highest paying rent.
// find the flat paying highest rent
// find get the floors
//find the flats along with rent paying
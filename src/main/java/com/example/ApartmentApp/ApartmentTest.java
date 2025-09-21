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
        Person p1 = new Person("H P VIRAJ", LocalDate.of(2002, 01,01),"6366192546",25000,"Male",new Address(), true);
        Person p2 = new Person("Chirag P", LocalDate.of(1968, 01,01),"6366195546",28000,"Male",new Address(), false);
        persons1[0]= p1;
        persons1[1]= p2;


        f1.setPersons(persons1);

        Flat f2 = new Flat();
        f2.setFloor(3);
        f2.setFlatId("102");
        f2.setRent(5500);

        Person[] persons2 = new Person[2];
        Person p3 = new Person("Rithesh", LocalDate.of(1991, 01,01),"6366192546",25000,"Male",new Address(), false);
        Person p4 = new Person("Veeresh", LocalDate.of(1989, 01,01),"6366195546",28000,"Male",new Address(), true);
        persons2[0]= p3;
        persons2[1]= p4;
        f2.setPersons(persons2);

        Flat f3 = new Flat();
        f3.setFloor(4);
        f3.setFlatId("103");
        f3.setRent(45000);

        Person[] persons3 = new Person[2];
        Person p5 = new Person("Nithin", LocalDate.of(1999, 01,01), "6366192546",25000,"Male",new Address(), true);
        Person p6 = new Person("Adharash", LocalDate.of(2000, 01,01),"6366195546",28000,"Male",new Address(), false);
        persons3[0]= p5;
        persons3[1]= p6;
        f3.setPersons(persons3);

        Flat f4 = new Flat();

        f4.setFloor(1);
        f4.setFlatId("105");
        f4.setRent(45000);

        Person[] persons4 = new Person[2];
        Person p7 = new Person("Virat", LocalDate.of(1988, 01,01),"6366192546",25000,"Male",new Address(), true);
        Person p8 = new Person("Anushka", LocalDate.of(1988, 01,01),"6366195546",28000,"Female",new Address(), false);
        persons4[0]= p7;
        persons4[1]= p8;
        f4.setPersons(persons4);

        Flat f5 = new Flat();

        f5.setFloor(2);
        f5.setFlatId("104");
        f5.setRent(5500);

        Person[] persons5 = new Person[2];
        Person p9 = new Person("Sachin", LocalDate.of(1973, 01,01),"6366192546",25000,"Male",new Address(), false);
        Person p10 = new Person("Anjali", LocalDate.of(1968, 01,01),"6366195546",28000,"Female",new Address(), true);
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
    public static Map<String,  Person[]> allTenantOwnersOfEachFlat()
    {
        Map<String , Person[]> allTenantOwners = new HashMap<>();
        Apartment app = getApartment();
        Flat[] flats = app.getFlats();
        Flat[] flats1 = new Flat[10];
        Person[] persons = new Person[5];
        String owner;

        for (int i = 0; i < flats.length; i++)
        {
           persons = flats[i].getPersons();
            for (int j = 0; j < persons.length; j++)
            {

            }



        }
        return  allTenantOwners;


    }
    public static Map<String, Person> getTenantOwnerWithId(){
        Map<String, Person> tenantOwnerWithidMap = new HashMap<>();

        Apartment apartment = getApartment();

        Flat[] flats = apartment.getFlats();

        for (int i = 0; i < flats.length; i++) {
            Person[] persons = flats[i].getPersons();

            for (int j = 0; j < persons.length; j++) {
                if(persons[j].isElder()){
                    tenantOwnerWithidMap.put(flats[i].getFlatId(), persons[j]);
                    break;
                }
            }

        }

        return tenantOwnerWithidMap;
    }

    public static void allThePeopleInFlat()
    {


    }
    public static void totalIncomeFromTheApartment()
    {

    }

    public static List<Person> getSeniorMostTenant(){
        List<Person> seniorMostTenantList = new ArrayList<>();

        Map<Integer, List<Person>> agePersonMap = new HashMap<>();

        int heighestAge = 0;

        Apartment apartment = getApartment();

        Flat[] flats = apartment.getFlats();

        for (Flat flat : flats){
            Person[] persons = flat.getPersons();

            for (Person person : persons){
                int age = person.calculateAge(); // Autoboxing
                List<Person> existingPerson = agePersonMap.get(age);
                if(existingPerson == null){
                    existingPerson = new ArrayList<>();
                }
                existingPerson.add(person);
                agePersonMap.put(age, existingPerson);//Age Autoboxing into Integer.
                if (heighestAge < age){
                    heighestAge = age;
                }
            }
        }

        seniorMostTenantList = agePersonMap.get(heighestAge);

        return seniorMostTenantList;
    }
    public static Map<String, Integer> getFlatIncome()
    {
        Map<String , Integer> flatIncomeMap = new HashMap<>();
        Apartment apartment = getApartment();
        Flat[] flats = apartment.getFlats();
        for (Flat f : flats)
        {
            Person[] persons = f.getPersons();
            int totalIncome = 0;
            for (Person p: persons)
            {
                totalIncome = totalIncome + p.getSalary();
            }
            flatIncomeMap.put(f.getFlatId(),totalIncome);
        }


        return flatIncomeMap;
    }

    public static Map<String, Integer> getFlatIncome_30Rent()
    {
        Map<String , Integer> flatIncomeMap = new HashMap<>();
        Apartment apartment = getApartment();
        Flat[] flats = apartment.getFlats();
        for (Flat f : flats)
        {
            Person[] persons = f.getPersons();
            int totalIncome = 0;
            for (Person p: persons)
            {
                totalIncome = totalIncome + p.getSalary();
            }
            if (totalIncome*30/100 < f.getRent())
            {
                flatIncomeMap.put(f.getFlatId(),totalIncome);
            }

        }


        return flatIncomeMap;
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
        //Map<String, Person[]> allTenantOwners1 = allTenantOwnersOfEachFlat();

        Map<String, Person> tenantOwnerWithId = getTenantOwnerWithId();
        List<Person> seniorMostTenant = getSeniorMostTenant();
        Map<String, Integer> flatIncome = getFlatIncome();
        Map<String, Integer> flatIncome_30Rent = getFlatIncome_30Rent();

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
        //System.out.println("Owners of the flat  = " + allTenantOwners1);

        System.out.println();
        System.out.println("Flats With Owner details");
        for (Map.Entry<String, Person> entry : tenantOwnerWithId.entrySet()){
            System.out.println(entry.getKey() +" ----- "+entry.getValue());
        }

        System.out.println();
        System.out.println("Senior most Tenants: ");
        for (Person p : seniorMostTenant){
            System.out.println(p);
        }

        System.out.println();
        System.out.println("Total Income Of Each Flat");
        for (Map.Entry<String, Integer> entry : flatIncome.entrySet()){
            System.out.println(entry.getKey() +" ----- "+entry.getValue());
        }

        System.out.println();
        System.out.println("Total Income 30% Rent ");
        for (Map.Entry<String, Integer> entry : flatIncome_30Rent.entrySet()){
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

/*
1) get all the tenant owners of the each flat // map
2) get all the people in the apartment
3) get the totalincome from the apartment
4) get the number of tenents in each flat
5) get the female tenenates in each flat
6) get the male tenents in each flat
7) get the income of each flat
8) get the flat details of which income is heighest
9) get the total no of senior citizens in apartment
10) get the senior citizen in each apartment.
11) get the senior most tenent in the apartment
12) get the senior lost female tenent.
13) get the senior most male tenent
14) get the no of senior citizens in each flat
15 get flat details where the rent is more than 30% of the total income of the flat
*/
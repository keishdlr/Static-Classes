package com.pluralsight;

public class NameFormatter {

    private String firstName;
    private String lastName;
    private String middleName;
    private String prefix;
    private String suffix;
    private String fullName;

    //private constructor so I cannot instantiate a class
    private NameFormatter(){
        System.out.println("Your Name is " +
                prefix + "" +
                firstName + "" +
                middleName + "" +
                lastName + "" +
                suffix);
    }

    public static String format (String firstName, String lastName){


        return firstName + " " + lastName;
    }

    public static  String format(String prefix, String firstName, String middleName, String lastName, String suffix){


        return prefix + " " + firstName + " " + middleName + " " + lastName + " " + suffix;
    }

    public static String format (String fullName){
        //use split to separate the name by space
        String[] parts = fullName.split(" ");


        return // some value;
    }
}

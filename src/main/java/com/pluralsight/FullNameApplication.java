package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        // create a scanner
        Scanner scanner = new Scanner(System.in);

        //prompt user to enter their name
        System.out.println("Please enter your name: ");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine().trim();

        //prompt user for their middle name
        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine().trim();

        //prompt user for their suffix
        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();



        //always print the first and last name
        // if they gave a middle name and/or suffix
        String fullName = firstName;

        //conditional
        if (!middleName.equals("")) {
            fullName += " " + middleName;
        }

        fullName += " " + lastName;


        // check if it the suffix is empty
        if(!suffix.isEmpty()){
            fullName += ", " + suffix;

        }

        System.out.println(fullName);

    }
}

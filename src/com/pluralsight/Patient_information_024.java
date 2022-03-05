package com.pluralsight;

import java.util.Scanner;

public class Patient_information_024 {
    public static void main(String[] args) {
        /**Instructions from your teacher:
         Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.
         Declare 2 int variables: age, zipcode
         Declare 2 double variables: height, weight.
         Declare boolean variable: isMarried (for marriage status).
         Declare 2 long variables: workPhoneNumber and personalPhoneNumber.
         -Create a Scanner object named scan.
         Execution flow with example:
         -Display prompt "Welcome to the patient portal!"
         -Display prompt "Please enter your personal information"
         -Display prompt "Enter your first name"
         Adam
         -Display prompt "Enter your last name"
         Sandler
         -Display prompt "Enter your email"
         adamsandler@email.com
         -Display prompt "Enter your street"
         123 Main Street
         -Display prompt "Enter your city"
         Fairfax
         -Display prompt "Enter your state"
         VA
         -Display prompt "Enter your zip code"
         22030
         -Display prompt "Enter your work phone number"
         5714567897
         -Display prompt "Enter your personal phone number"
         7033334455
         -Display prompt "Enter your age"
         31
         -Display prompt "Enter your height"
         5.2
         -Display prompt "Enter your weight"
         173.2
         -Display prompt "Are you married?"
         true
         -build contacts variable by concatenating work phone, personal phone and email
         -build fullName variable by concatenating first name and last name
         -build address variable by concatenating street, city, state, zip code
         //this is should be an output in the console (terminal)
         Patient personal information
         Full name: Adam Sandler
         Address: 123 Main Street, Fairfax, VA 22030
         Contacts: work phone number - 5714567897, personal phone number - 7033334455,  email: adamsandler@email.com
         Age: 31
         Height: 5.2
         Weight: 173.2 pounds
         Married: true*/

        Scanner scan = new Scanner(System.in);
        String firstName,lastName,fullName,email,street,state,city,address,contacts;
        int age,zipcode;
        boolean isMarried;
        long workPhoneNumber,personalPhoneNumber;
        double height,weight;
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        firstName = scan.next();
        System.out.println("Enter your last name");
        lastName = scan.next();
        System.out.println("Enter your email");
        email = scan.next();
        System.out.println("Enter your street");
        street = scan.next();
        scan.nextLine();
        System.out.println("Enter your city");
        city = scan.next();
        System.out.println("Enter your state");
        state = scan.next();
        System.out.println("Enter your zip code");
        zipcode = scan.nextInt();
        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your height");
        height = scan.nextDouble();
        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();
        System.out.println("Full name: "+firstName+" "+lastName);
        System.out.println("Address: "+street+","+city+","+state+" "+zipcode);
        System.out.println("Contacts: "+"work phone number - "+workPhoneNumber+", personal phone number - "+personalPhoneNumber+
                ", email: "+email);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight+" pounds");
        System.out.println(isMarried);


    }
}

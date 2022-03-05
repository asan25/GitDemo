package com.pluralsight;

import java.util.Scanner;

public class Vendinge_Machine {
    public static void main(String[] args) {
        /**Instructions from your teacher:

         Write a program that determines the change to be dispensed from a vending machine.
         An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments
         (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
         dollar bill to pay for the item.
         - int variable itemPrice
         - int variables quarters, dimes, nickels
         - Scanner object
         Program accepts itemPrice, which is a price for the item you would like to purchase.
         Positive behaviour:
         Please follow the example:
         -If the Item price was entered 95: need to display message: Your change is 0 quarters, 0 dimes, and 1 nickels.
         -If the Item price was entered 60: need to display message: Your change is 1 quarters, 1 dimes, and 1 nickels.
         Note: Implement a program that calculates the minimum number of coins required to give a user change.
         Negative behaviour:
         If itemPrice is less than 25 or more than 100 cents, then display error message:
         Invalid price!
         If itemPrice is not divisible by 5, then also display error message:
         Invalid price!
         use (itemPrice % 5 == 0) expression to find it is divisible by 5.
         Do not display anything else.*/
        Scanner scan = new Scanner(System.in);
        int itemPrice;
        int quarters,dimes,nickels;
        System.out.println("Enter your item");
        itemPrice = scan.nextInt();
        int change=100-itemPrice;
        quarters=change/25;
        dimes=(change%25)/10;
        nickels=(((change-quarters*25)-dimes*10))/5;
        if(itemPrice<25||itemPrice>100){
            System.out.println("Invalid price!");
        }
        else if(itemPrice%5!=0){
            System.out.println("Invalid price!");
        }
        else  {
            System.out.println("Your change is "+ quarters+" quarters, " +dimes+" dimes, and "+ nickels +" nickels.");
        }


    }
}

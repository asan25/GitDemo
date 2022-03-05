package Start_number_33;

import java.util.Scanner;

public class Video_games_coupons_35 {
    public static void main(String[] args) {
        /**Instructions from your teacher:
         Note: prerequisite - if-else statement
         The video game machines at your local arcade output coupons according to how well you play the game.
         You can redeem 10 coupons for a candy bar or 3 coupons for a gumball. You prefer candy bars to gumballs.
         Write a program that defines a variable initially assigned to the number of coupons you win.
         Next, the program should output how many candy bars and
         gumballs you can get if you spend all of your coupons on candy bars first, and any remaining coupons on gumballs.
         if  the coupons are not enough for any redeem, display message:
         "Not enough coupons"
         `Example1:`
         `Display prompt: "Enter number of coupons:"`
         `13`
         `Display prompt: "Number of Candies: 1"`
         `Display prompt: "Number of Gumballs: 1"`
         `Example2:`
         `Display prompt: "Enter number of coupons:"`
         `23`
         `Display prompt: "Number of Candies: 2"`
         `Display prompt: "Number of Gumballs: 1"`
         `Example3:`
         `Display prompt: "Enter number of coupons:"`
         `2`
         `Display prompt: "Not enough coupons"`*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons = scan.nextInt();
        int candybar=coupons/10;
        int gumball = (coupons -candybar*10)/3;
        if(coupons<3){
            System.out.println("Not enough coupons");
        }

        else {
            System.out.println("Number of Candies: "+candybar);
            System.out.println("Number of Gumballs: "+gumball);
        }
    }
}

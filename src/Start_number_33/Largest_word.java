package Start_number_33;

import java.util.Scanner;

public class Largest_word {
    public static void main(String[] args) {
        /**Instructions from your teacher:
         Write a program that will print out the longest word.
         Example 1:
         Enter first word:
         Input :java
         Enter second word:
         Input : python
         Output: "python is the largest word"*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word:");
        String firstWord = scan.next();
        System.out.println("Enter second word:");
        String secondWord = scan.next();
        if(firstWord.length()>secondWord.length()){
            System.out.println(firstWord+" is the largest word");
        }
        else{
            System.out.println(secondWord+" is the largest word");
        }


    }
}

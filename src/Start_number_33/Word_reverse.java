package Start_number_33;

import java.util.Scanner;

public class Word_reverse {
    public static void main(String[] args) {
        /**Instructions from your teacher:
         Write a program that will reverse a string. Your program should reverse a string
         only 5 characters long. If word is shorter, display message: "Too short!".
         If word is longer, display message: "Too long!". Otherwise, reverse this word
         and print out result into the console.
         Example:
         input: cat
         output: Too short!
         Example:
         input: singularity
         output:
         Example:
         input: apple
         output: elppa*/
        Scanner scan  = new Scanner(System.in);
        String word = scan.next();

        if(word.length()>5){
            System.out.println("Too long!");
        }
        else if(word.length()<5){
            System.out.println("Too short!");
        }
        else {
            String reverseWord="";
           for(int i=word.length()-1;i>=0;i--){
               reverseWord+=word.charAt(i);
           }
            System.out.println(reverseWord);
        }
    }
}

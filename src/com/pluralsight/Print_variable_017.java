package com.pluralsight;

import java.util.Scanner;

public class Print_variable_017 {
    public static void main(String[] args) {
        /**Instructions from your teacher:
         2 String variables are already declared and assigned values.
         They will hold different programming language names.
         Using those variables print the message exactly like below.
         Ex:
         Assume lan1 = "Java" and lan2 = "SQL"
         You need to print exactly:
         I will learn "Java" and "SQL" at Yoll Academy.*/
        Scanner scan = new Scanner(System.in);
        String lan1 = scan.nextLine();
        String lan2 = scan.nextLine();

        //WRITE YOUR CODE BELOW THIS LINE:
        System.out.println("I will learn "+"\""+lan1+"\""+ " and "+"\""+lan2+"\""+" at Yoll Academy.");
    }
}
